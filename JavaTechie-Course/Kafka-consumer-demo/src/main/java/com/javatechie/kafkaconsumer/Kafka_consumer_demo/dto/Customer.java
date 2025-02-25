package com.javatechie.kafkaconsumer.Kafka_consumer_demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private long id;
    private String name;
    private String age;
    private String email;
    private String city;
}
