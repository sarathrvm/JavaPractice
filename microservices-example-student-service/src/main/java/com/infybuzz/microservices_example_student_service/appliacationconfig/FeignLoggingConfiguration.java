package com.infybuzz.microservices_example_student_service.appliacationconfig;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLoggingConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(FeignLoggingConfiguration.class);

    @Bean
    public RequestInterceptor requestInterceptor(){

        return (RequestTemplate template)->{
            logger.info("Url is "+template.url());
            logger.info("body template are "+template.bodyTemplate());

        };

    }
}
