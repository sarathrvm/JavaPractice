package com.javatechie.spring_actuator_practice.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.spring_actuator_practice.Dto.EmployeeDto;
import com.javatechie.spring_actuator_practice.Service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    private static final Logger LOGGER_FACTORY = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/getEmployees")
    public ResponseEntity<List<EmployeeDto>> createEmployee() throws JsonProcessingException {
        List<EmployeeDto> employeeDetails = employeeService.createEmployeeDetails();
        LOGGER_FACTORY.info("EmployeeController:getEmployees fetch all employees {} ",new ObjectMapper().writeValueAsString(employeeDetails));
        return new ResponseEntity<>(employeeDetails,HttpStatus.CREATED);
    }
}
