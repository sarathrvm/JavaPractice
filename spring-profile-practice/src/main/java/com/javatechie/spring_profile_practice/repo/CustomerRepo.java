package com.javatechie.spring_profile_practice.repo;

import com.javatechie.spring_profile_practice.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity,Integer> {


}
