package com.javatechie.spring_web_flux.handler;

import com.javatechie.spring_web_flux.dao.CustomerDao;
import com.javatechie.spring_web_flux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerStreamHandler {

    @Autowired
    private CustomerDao customerDao;


    public Mono<ServerResponse> loadCustomerStream(ServerRequest serverRequest){
        Flux<Customer> customerList = customerDao.getCustomerStream();

        return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM)
                .body(customerList, Customer.class);

    }
}
