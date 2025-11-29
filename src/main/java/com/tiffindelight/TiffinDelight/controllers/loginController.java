package com.tiffindelight.TiffinDelight.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {


    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @PostMapping("/putmein")
    public String homemaibhejo(){
        return "home";
    }
}
