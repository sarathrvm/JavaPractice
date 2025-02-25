package com.infybuzz.microservices_example_student_service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDto {

//    private long addressId;

    private String street;


    private String city;
}
