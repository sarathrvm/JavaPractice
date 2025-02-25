package com.infybuzz.microservices_example_student_service.feignclients;


import com.infybuzz.microservices_example_student_service.appliacationconfig.FeignLoggingConfiguration;
import com.infybuzz.microservices_example_student_service.dto.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "Address-service", url = "http://localhost:8080/address/api", configuration = FeignLoggingConfiguration.class)
public interface AddressFeignClient {


    @GetMapping("/getById/{id}")
    public AddressDto getAddressDetailsById(@PathVariable long id);


}
