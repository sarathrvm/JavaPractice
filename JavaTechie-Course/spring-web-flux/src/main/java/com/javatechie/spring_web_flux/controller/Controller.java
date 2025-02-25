package com.javatechie.spring_web_flux.controller;


import com.javatechie.spring_web_flux.dto.Customer;
import com.javatechie.spring_web_flux.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/Customers")
public class Controller {


    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return service.loadCustomers();
    }

    @GetMapping(value = "/stream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Customer> getAllCustomersStream(){
        return service.loadCustomerStream();
    }
}
