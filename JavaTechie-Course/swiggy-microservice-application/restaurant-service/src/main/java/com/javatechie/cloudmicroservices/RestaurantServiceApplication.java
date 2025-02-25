package com.javatechie.cloudmicroservices;


import com.netflix.discovery.EurekaNamespace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class RestaurantServiceApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SpringApplication.run(RestaurantServiceApplication.class);
    }
}