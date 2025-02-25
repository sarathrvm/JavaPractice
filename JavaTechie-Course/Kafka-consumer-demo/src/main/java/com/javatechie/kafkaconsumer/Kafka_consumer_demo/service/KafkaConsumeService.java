package com.javatechie.kafkaconsumer.Kafka_consumer_demo.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service

public class KafkaConsumeService {


    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumeService.class);


    @Value("${topic.name}")
    private String topicName;



    @RetryableTopic(attempts = "4")//by default 3 times
    @KafkaListener(topics = "${topic.name}",groupId = "jt-group-1")
    public void consumeMessage(String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,@Header(KafkaHeaders.OFFSET) long offset){

        LOGGER.info("Message consumed from kafka is: "+message);

    }



    @KafkaListener(topics = "${topic.name}",groupId = "jt-group")
    public void consumeEvent(String message){

        LOGGER.info("Message consumed from kafka is: "+message);

    }

//
//    @DltHandler
//    public void listenDLT(String message, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,)


}
