package com.javatechie.microservice.user_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javatechie.microservice.user_service.entity.User;
import com.javatechie.microservice.user_service.service.UserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {


    @Autowired
    private UserDetailsService userDetailsService;

    @Value("${server.port}")
    private int port;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        return ResponseEntity.ok(userDetailsService.addNewUser(user));
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id) throws JsonProcessingException {
        log.info("userController::fetched user details from userid: "+id);
        log.info("request is landed on port: "+port);

        User user= userDetailsService.getUserById(id);

        log.info("UserController::getuser fetching user details: "+new ObjectMapper().writeValueAsString(user));

        return ResponseEntity.ok(user);

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> updateUserBalance(@PathVariable int id, @RequestParam double usedAmount){

        return ResponseEntity.ok(userDetailsService.updateAccountStatus(id,usedAmount));
    }

}
