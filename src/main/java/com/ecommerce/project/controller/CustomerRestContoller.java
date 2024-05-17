package com.ecommerce.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api/")
public class CustomerRestContoller {

    @GetMapping("message")
    public String message(){
        return "Testing";
    }

}
