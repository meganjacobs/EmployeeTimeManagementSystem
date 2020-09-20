package com.adp3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

    @RequestMapping({"/", "/index","/home"})
    String home(){
        return "EmployeeTimeManagement Application... ";
    }
}
