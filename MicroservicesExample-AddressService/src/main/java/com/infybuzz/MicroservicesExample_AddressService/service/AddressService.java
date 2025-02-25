package com.infybuzz.MicroservicesExample_AddressService.service;

import com.infybuzz.MicroservicesExample_AddressService.dto.AddressDto;
import com.infybuzz.MicroservicesExample_AddressService.entity.Address;
import com.infybuzz.MicroservicesExample_AddressService.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepo addressRepo;

    public Address createAddressService(AddressDto addressDto){

        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());

       return addressRepo.save(address);

    }

    public AddressDto getAddressById(Long id){

        Address address = addressRepo.findById(id).orElse(null);

        AddressDto addressDto= AddressDto.builder()
                .street(address.getStreet())
                .city(address.getCity())
                .build();

        return addressDto;
    }
}
