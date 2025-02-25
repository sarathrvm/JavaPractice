package com.infybuzz.MicroservicesExample_AddressService.Controller;

import com.infybuzz.MicroservicesExample_AddressService.dto.AddressDto;
import com.infybuzz.MicroservicesExample_AddressService.entity.Address;
import com.infybuzz.MicroservicesExample_AddressService.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/address")
@RestController
public class AddressController {


    @Autowired
    private AddressService addressService;


    @PostMapping("/api/create")
    public ResponseEntity<Address> createAddress(@RequestBody AddressDto addressDto){

        return ResponseEntity.ok(addressService.createAddressService(addressDto));
    }


    @GetMapping("/api/getById/{id}")
    public ResponseEntity<AddressDto> getAddressById(@PathVariable Long id){
        return ResponseEntity.ok(addressService.getAddressById(id));
    }


}
