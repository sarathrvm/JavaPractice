package com.javatechie.spring_web_flux.handler;

import com.javatechie.spring_web_flux.dao.CustomerDao;
import com.javatechie.spring_web_flux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {

    @Autowired
    private CustomerDao customerDao;

    public Mono<ServerResponse> loadCustomers(ServerRequest request){
        Flux<Customer> customerList = customerDao.getCustomerList();

        return ServerResponse.ok().body(customerList, Customer.class);
    }

    public Mono<ServerResponse> findCustomerById(ServerRequest request){
        int id = Integer.parseInt(request.pathVariable("id"));

        Mono<Customer> customerMono = customerDao.getCustomerStream().filter(c -> c.getId() == id).next();
        return ServerResponse.ok().body(customerMono, Customer.class);
    }


    public Mono<ServerResponse> saveCustomer(ServerRequest serverRequest){
        Mono<Customer> customerMono = serverRequest.bodyToMono(Customer.class);
        Mono<String> saveResponse = customerMono.map(obj -> obj.getId() + ": " + obj.getName());

        return ServerResponse.ok().body(saveResponse, Customer.class);


    }

}
