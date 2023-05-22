package com.UST.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Controller {
    @GetMapping("/welcome")
    public String welcom() {
        return "welcome";
    }
    @GetMapping("/login")
    public String log(){
        return "login";
    }


}
