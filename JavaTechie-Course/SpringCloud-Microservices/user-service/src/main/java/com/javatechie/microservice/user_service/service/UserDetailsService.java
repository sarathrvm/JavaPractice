package com.javatechie.microservice.user_service.service;

import com.javatechie.microservice.user_service.entity.User;
import com.javatechie.microservice.user_service.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService {


    @Autowired
    private UserRepo userRepo;


    public User addNewUser(User user){
        return userRepo.save(user);
    }


    public User getUserById(int id){

        return userRepo.findById(id).orElseThrow(()->new RuntimeException("user not found for id: "+id));

    }


    public User updateAccountStatus(int id, double usedAmount){
        User userDetailsFromDB = getUserById(id);
        userDetailsFromDB.setAvailableAmount(userDetailsFromDB.getAvailableAmount()-usedAmount);

        return userRepo.save(userDetailsFromDB);
    }


}
