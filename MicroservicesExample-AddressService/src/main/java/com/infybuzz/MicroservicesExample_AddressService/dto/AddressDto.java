package com.infybuzz.MicroservicesExample_AddressService.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter
public class AddressDto {

    private String street;

    private String city;
}
