package com.aivle.mini7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @GetMapping("/auth/register")
    public String joinPage(){
        return "Emergency/join";
    }

    @GetMapping("/auth/login")
    public String LoginPage(){
        return "Emergency/login";
    }

}
