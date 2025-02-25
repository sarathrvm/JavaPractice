package com.infybuzz.microservices_example_student_service.controller;

import com.infybuzz.microservices_example_student_service.dto.AddressDto;
import com.infybuzz.microservices_example_student_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/api/addressById/{id}")
    public ResponseEntity<AddressDto> getAddressById(@PathVariable long id){
        return ResponseEntity.ok(studentService.getAddressById(id));
    }


}
