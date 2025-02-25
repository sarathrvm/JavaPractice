package com.javatechie.spring_profile_practice.controller;

import com.javatechie.spring_profile_practice.dto.CustomerDto;
import com.javatechie.spring_profile_practice.entity.CustomerEntity;
import com.javatechie.spring_profile_practice.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/Customers")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveCustomers")
    public ResponseEntity<List<CustomerEntity>> saveCustomers(@RequestBody @Valid List<CustomerDto> customerDtoList){
        List<CustomerEntity> customerEntities = customerService.addNewCustomers(customerDtoList);

        return new ResponseEntity<>(customerEntities, HttpStatus.CREATED);
    }

    @GetMapping(value = "/fetchCustomers")
    public ResponseEntity<List<CustomerDto>> fetchAllCustomers(){
        List<CustomerDto> customerDtoList = customerService.getAllCustomers();

        return ResponseEntity.ok(customerDtoList);
    }

}
