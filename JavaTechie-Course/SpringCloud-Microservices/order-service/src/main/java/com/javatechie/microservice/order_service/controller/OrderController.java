package com.javatechie.microservice.order_service.controller;


import com.javatechie.microservice.order_service.entity.Order;
import com.javatechie.microservice.order_service.service.OrderService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order){
        return ResponseEntity.ok(orderService.placeAnOrder(order));
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderDetails(@PathVariable String orderId){
        return ResponseEntity.ok(orderService.getOrder(orderId));
    }

}
