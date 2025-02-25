package com.javatechie.kafkapublisher.Kafka_demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.kafkapublisher.Kafka_demo.dto.Customer;
import com.javatechie.kafkapublisher.Kafka_demo.service.KafkaPublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/kafka-demo")
public class KafkaPublisherController {


    @Autowired
    private KafkaPublishService kafkaPublishService;


//    @GetMapping("/publishMessage/{message}")
//    public ResponseEntity<String> publishMessage(@PathVariable String message){
//        try{
//
//            for(int i=0;i<=1000;i++){
//                kafkaPublishService.publishMessage(message+"_"+i);
//            }
//
//            return ResponseEntity.ok("successfully published the message to Kafka");
//        }
//        catch (Exception e){
//            return ResponseEntity.internalServerError().body("failed to publish message to kafka");
//        }
//
//    }

    @PostMapping("/publishEvent")
    public ResponseEntity<String> publishEvent(@RequestBody Customer customer){
        try{

//            for(int i=0;i<=1000;i++){
//                kafkaPublishService.publishMessage(message+"_"+i);
//            }

            System.out.println(new ObjectMapper().writeValueAsString(customer));

            kafkaPublishService.publishEvent(customer);

            return ResponseEntity.ok("successfully published the event to Kafka");
        }
        catch (Exception e){
            return ResponseEntity.internalServerError().body("failed to publish message to kafka "+ Arrays.toString(e.getStackTrace()));
        }

    }

}
