package com.adp3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Controller: HomeController created for mapping to home/index path of the application
 */

@RestController
public class HomeController {

    /*method used to map to url to path
     * @param: baseUrl (localhost:8080/home)
     * @return: EmployeeTimeManagement Application as /home
     * */
    @RequestMapping({"/", "/index","/home"})
    String home(){
        return "EmployeeTimeManagement Application... ";
    }
}
