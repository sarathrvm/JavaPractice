package com.infybuzz.MicroservicesExample_AddressService.repo;

import com.infybuzz.MicroservicesExample_AddressService.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address,Long> {
}
