package com.javatechie.spring_web_flux.dao;

import com.javatechie.spring_web_flux.dto.Customer;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class CustomerDao {


    public List<Customer> getCustomers(){

        return IntStream.rangeClosed(1,50)
                .mapToObj(i->new Customer(i,"Customer"+i))
                .peek(i-> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
                .peek(i-> System.out.println("processing item: "+i))
                .collect(Collectors.toList());
    }

    public Flux<Customer> getCustomerStream(){
        return Flux.range(1,50)
                .map(i->new Customer(i,"Customer"+i))
                .doOnNext(i-> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
                .doOnNext(i-> System.out.println("processing item stream: "+i));
    }


    public Flux<Customer> getCustomerList(){
        return Flux.range(1,50)
                .map(i->new Customer(i,"Customer"+i))
                .doOnNext(i-> System.out.println("processing item stream: "+i));
    }
}
