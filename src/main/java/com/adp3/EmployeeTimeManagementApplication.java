package com.adp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Main Application: This is the main application that runs the Spring application .run method()
 */

@SpringBootApplication
public class EmployeeTimeManagementApplication {

    /*method used to run the Main application
     * @param: Main class of the application
     * @return: running Spring boot application
     * */

    public static void main(String[] args) {
        SpringApplication.run(EmployeeTimeManagementApplication.class, args);
    }

}
