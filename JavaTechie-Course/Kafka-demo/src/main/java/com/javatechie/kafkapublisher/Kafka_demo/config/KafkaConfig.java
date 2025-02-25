package com.javatechie.kafkapublisher.Kafka_demo.config;

import com.javatechie.kafkapublisher.Kafka_demo.dto.Customer;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConfig {

    @Value("${topic.name}")
    private String topicName;

    @Bean
    public NewTopic createNewTopic(){

        return new NewTopic(topicName,3,(short)1);
    }


    @Bean
    public Map<String,Object> producerConfig(){
        Map<String,Object> props = new HashMap<>();

        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);

        return props;
    }


    @Bean
    public ProducerFactory<String,Object> producerFactory(){
        return new DefaultKafkaProducerFactory<>(producerConfig());
    }

    @Bean(name = "defaultKafkaTemplate")
    public KafkaTemplate<String,Object> kafkaTemplate(){
        return new KafkaTemplate<>(producerFactory());
    }



    @Bean
    public ProducerFactory<String,Customer> producerCustomerFactory(){
        return new DefaultKafkaProducerFactory<>(producerConfig());
    }

    @Bean(name = "customerKafkaTemplate")
    public KafkaTemplate<String, Customer> kafkaCustomerTemplate(){
        return new KafkaTemplate<>(producerCustomerFactory());
    }
}
