package com.javatechie.microservice.order_service.service;

import com.javatechie.microservice.order_service.entity.Order;
import com.javatechie.microservice.order_service.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
   private KafkaTemplate<String,Object> kafkaTemplate;

    @Value("${topic.name}")
    private String topicName;



    public String placeAnOrder(Order order){
        order.setPurchaseDate(new Date());
        order.setOrderId(UUID.randomUUID().toString().split("-")[0]);
        Order updatedOrder = orderRepository.save(order);

        //send order to kafka

        CompletableFuture<SendResult<String, Object>> kafkaFuture = kafkaTemplate.send(topicName, updatedOrder);

        CompletableFuture<SendResult<String, Object>> sendResultCompletableFuture = kafkaFuture.whenComplete((res, ex) -> {
            if (ex == null) {
                System.out.println("order successfully sent from kafka producer. " + res.getRecordMetadata().toString());
            } else {
                System.out.println("failed in sending the order details to kafka due to exception: " + ex.getMessage());
            }
        });


        return "order details sent to kafka";
    }

    public Order getOrder(String id){
       return orderRepository.findById(id).orElseThrow(()->new RuntimeException("failed to get order details for order id: "+id));
    }
}
