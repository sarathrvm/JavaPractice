package com.javatechie.cloudmicroservices.payment_service.config;

import com.javatechie.cloudmicroservices.payment_service.dto.OrderDto;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class OrderProcessingConsumer {


    @Value("${topic.name}")
    private String topicName;

    @KafkaListener(topics ="${topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public String consumeEvent(OrderDto orderDto){



        return null;
    }
}
