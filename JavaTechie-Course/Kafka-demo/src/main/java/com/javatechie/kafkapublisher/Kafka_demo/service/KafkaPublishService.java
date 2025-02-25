package com.javatechie.kafkapublisher.Kafka_demo.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.kafkapublisher.Kafka_demo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class KafkaPublishService {


    @Qualifier("defaultKafkaTemplate")
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Qualifier("customerKafkaTemplate")
    @Autowired
    private KafkaTemplate<String,Customer> customerKafkaTemplate;


    @Value("${topic.name}")
    private String topicName;


    public void publishMessage(String message){
        CompletableFuture<SendResult<String, Object>> future = kafkaTemplate.send(topicName, message);

        future.whenComplete((result,ex)->{
            if(ex==null){
                System.out.println("published message to kafka with offset: "+result.getRecordMetadata().offset()+" on topic: "+result.getRecordMetadata().topic()+" with message: "+result.getRecordMetadata().toString());
            }
            else{
                System.out.println("unable to send messages to kafka due to exception: "+ex.getMessage());
//                System.out.println("published message to kafka with offset: "+result.getRecordMetadata().offset()+" on topic: "+result.getRecordMetadata().topic()+" with message: "+result.getRecordMetadata().toString());
            }
        });
    }


    public void publishEvent(Customer customer) throws JsonProcessingException {
        System.out.println(topicName);
        System.out.println(new ObjectMapper().writeValueAsString(customer));
        CompletableFuture<SendResult<String, Customer>> future = customerKafkaTemplate.send(topicName, customer);

        future.whenComplete((result,ex)->{
            if(ex==null){
                System.out.println("published message to kafka with offset: "+result.getRecordMetadata().offset()+" on topic: "+result.getRecordMetadata().topic()+" with message: "+result.getRecordMetadata().toString());
            }
            else{
                System.out.println("unable to send messages to kafka due to exception: "+ex.getMessage());
//                System.out.println("published message to kafka with offset: "+result.getRecordMetadata().offset()+" on topic: "+result.getRecordMetadata().topic()+" with message: "+result.getRecordMetadata().toString());
            }
        });
    }
}
