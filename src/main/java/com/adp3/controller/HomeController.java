package com.adp3.controller;

import com.adp3.entity.standalone.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping("/create")
    public Employee employee(@RequestBody  Employee employee) {

        return employee;

    }

}
