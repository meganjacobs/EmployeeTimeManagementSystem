package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.service.standalone.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee controller using String Boot
 * 2020
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee) {

        Employee newEmployee = EmployeeFactory.createEmployee( employee.getEmpName(), employee.getEmpLastName(), employee.getEmpPhoneNumber(), employee.getEmpDOB() );
        return employeeService.create( newEmployee );
    }

    @GetMapping("/read/{id}")
    public Employee read(@PathVariable String id){

        return  employeeService.read(id);
    }

    @PutMapping("/update/{id}")
    public Employee update(@RequestBody Employee employee){

        return employeeService.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){

        System.out.println("Deleted Employee");
        employeeService.delete(id);
    }

    @GetMapping("/all")
    public Set<Employee> getAll() {

        return employeeService.getAll();

    }
}