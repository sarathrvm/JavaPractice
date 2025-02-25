package com.javatechie.spring_profile_practice.service;

import com.javatechie.spring_profile_practice.dto.CustomerDto;
import com.javatechie.spring_profile_practice.entity.CustomerEntity;
import com.javatechie.spring_profile_practice.repo.CustomerRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Profile(value = {"dev","prod","stg"})
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Value("${application.message}")
    private String message;

    @PostConstruct
    public void init(){

        System.out.println("*******"+message);
    }

    public List<CustomerEntity> addNewCustomers(List<CustomerDto> customerDtoList){
        List<CustomerEntity> CustomerEntityList = customerDtoList.stream()
                .map(customerDto -> new CustomerEntity(customerDto.getName(), customerDto.getEmail(), customerDto.getPhone(), formatStringToDate(customerDto.getDob())))
                .collect(Collectors.toList());
        customerRepo.saveAll(CustomerEntityList);

        return CustomerEntityList;
    }


    public List<CustomerDto> getAllCustomers(){
        List<CustomerEntity> customerEntityList = customerRepo.findAll();

        return customerEntityList.stream()
                .map(customerEntity -> new CustomerDto(customerEntity.getName(), customerEntity.getEmail(), customerEntity.getPhone(), formatDate(customerEntity.getDob())))
                .collect(Collectors.toList());
    }

    public String formatDate(Date date){
        return new SimpleDateFormat("MM/dd/yyyy").format(date);
    }

    public Date formatStringToDate(String date){
        return new Date(date);
    }
}
