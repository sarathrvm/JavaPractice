package com.javatechie.spring_actuator_practice.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.spring_actuator_practice.Dto.EmployeeDto;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.IntStream;

@Service
@Slf4j
public class EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);



    public List<EmployeeDto> createEmployeeDetails() throws JsonProcessingException {


        List<EmployeeDto> list = IntStream.rangeClosed(0, 10)
                .mapToObj(i -> new EmployeeDto(i, "employee" + i))
                .toList();
        LOGGER.info("EmployeeService:createEmployeeDetails employees created are {}",new ObjectMapper().writeValueAsString(list));

        return list;
    }
}
