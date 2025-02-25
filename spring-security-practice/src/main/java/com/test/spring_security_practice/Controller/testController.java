package com.test.spring_security_practice.Controller;

import com.test.spring_security_practice.UserEntity;
import com.test.spring_security_practice.UserRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class testController {


    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    UserRepo userRepo;


    private UserEntity user2;





    @GetMapping("/about")
    public String getMessage(HttpServletRequest request){
        return "message is :"+request.getSession().getId();
    }


    @PostMapping("/login")
    public String login(@RequestBody UserEntity user){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),passwordEncoder.encode(user.getPassword())));


        if(authentication.isAuthenticated()){
            return "success";
        }
        else{
            return "failed to login ";
        }

    }

    @PostMapping("/register")
    public String register(@RequestBody UserEntity user1){

        UserEntity user2 = new UserEntity();

        user2.setPassword(passwordEncoder.encode(user1.getPassword()));
        user2.setRole(user1.getRole());
        user2.setUsername(user1.getUsername());
        userRepo.save(user2);

        return "user added to db";
    }



}
