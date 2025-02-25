package com.javatechie.spring_web_flux.service;

import com.javatechie.spring_web_flux.dao.CustomerDao;
import com.javatechie.spring_web_flux.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerDao customerDao;


    public List<Customer> loadCustomers(){
        return customerDao.getCustomers();
    }


    public Flux<Customer> loadCustomerStream(){
        return customerDao.getCustomerStream();
    }



}
