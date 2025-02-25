package com.infybuzz.microservices_example_student_service.service;

import com.infybuzz.microservices_example_student_service.dto.AddressDto;
import com.infybuzz.microservices_example_student_service.entity.Student;
import com.infybuzz.microservices_example_student_service.feignclients.AddressFeignClient;
import com.infybuzz.microservices_example_student_service.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private AddressFeignClient addressFeignClient;

    public AddressDto getAddressById(Long id){
       return addressFeignClient.getAddressDetailsById(id);
    }
}
