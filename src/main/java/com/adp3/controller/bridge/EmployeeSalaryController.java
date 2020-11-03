package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.entity.standalone.Employee;
import com.adp3.factory.bridge.EmployeeSalaryFactory;
import com.adp3.service.bridge.impl.EmployeeSalaryServiceImpl;
import com.adp3.service.standalone.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Controller:
 * 1. EmployeeSalaryController - all requests that need employeeSalary are directed to this class.
 * 2. Exposes the methods within the employeeSalaryService
 */

@RestController
@RequestMapping("/employeeSalary")
public class EmployeeSalaryController {


    //access to EmployeeSalaryService bean using Spring autowired annotation
    @Autowired
    private EmployeeSalaryServiceImpl employeeSalaryService;

    @Autowired
    private EmployeeServiceImpl employeeService;

    //exposes method used to create a new EmployeeSalary
    @PostMapping("/create")
    public EmployeeSalary create(@RequestBody EmployeeSalary empSal){
        boolean employeeExist = false;

       // System.out.println(empSal.getEmpID());

        Employee employee = employeeService.read(empSal.getEmpID());   //calling employee.java
        if (employee != null) {
            employeeExist = true;
        }

        if (employeeExist)
            return employeeSalaryService.create(empSal);
        else return EmployeeSalaryFactory.buildEmployeeSalary("", empSal.getEmpRate(), empSal.getEmpHours());
      // EmployeeSalary newEmployeeSalary = EmployeeSalaryFactory.buildEmployeeSalary(empSal.getEmpID(),empSal.getEmpSalaryRate(),empSal.getEmpHours());
        //return employeeSalaryService.create(empSal);

    }

    //exposes method used to read an EmployeeSalary
    @GetMapping("/read/{id}")
    public EmployeeSalary read(@PathVariable String id){
        return employeeSalaryService.read(id);
    }

    //exposes method used to update a  EmployeeSalary
    @PostMapping("/update")
    public EmployeeSalary update(@RequestBody EmployeeSalary empSal){
        return employeeSalaryService.update(empSal);
    }

    //exposes method used to get all from EmployeeSalary
    @GetMapping("/all")
    public Set<EmployeeSalary> getall(){
        return employeeSalaryService.getAll();
    }

    //exposes method used to delete a EmployeeSalary
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        employeeSalaryService.delete(id);
    }




}
