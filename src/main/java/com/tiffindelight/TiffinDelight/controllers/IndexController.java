package com.tiffindelight.TiffinDelight.controllers;

import com.tiffindelight.TiffinDelight.entities.UserEntity;
import com.tiffindelight.TiffinDelight.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @Autowired
    private final  UserRepository userRepository;

    public IndexController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String start(){
        return "index";
    }

    @GetMapping("/login")
    public String loginpage(){
        return "login";
    }

    @GetMapping("/home")
    public String homepage(){
        return "home";
    }

    @PostMapping("/register")
    public String registered(@ModelAttribute UserEntity user){
        userRepository.save(user);

        user.display();
        return "home";
    }
}
