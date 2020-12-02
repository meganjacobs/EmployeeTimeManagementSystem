package com.adp3.controller.bridge;


import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.factory.bridge.EmployeeLeaveFactory;
import com.adp3.factory.bridge.EmployeeSalaryFactory;
import com.adp3.service.bridge.EmpLeaveService;
import com.adp3.service.bridge.impl.EmpLeaveServiceImpl;
import com.adp3.service.bridge.impl.EmployeeStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Author: Zubair Van Oudtshoorn
 * Class: Part Time
 * Student number: 2172903795
 * Class Description: EmployeeSLeaveController
 */

@RestController
@RequestMapping("/employeeLeave")
public class EmployeeLeaveController {

    @Autowired
    private EmpLeaveServiceImpl empLeaveService;


    //Method to create employee Leave record
    @PostMapping("/create")
    public EmployeeLeave create(@RequestBody EmployeeLeave empLeave){
        EmployeeLeave newLeaveRecord = EmployeeLeaveFactory.calcEmployeeLeave(empLeave.getEmpID(),empLeave.getLeaveID(),
                empLeave.getStartDate(),empLeave.getEndDate());

        return empLeaveService.create(empLeave);

    }
    //Method to view an employee Leave record
    @GetMapping("/read/{id}")
    public EmployeeLeave read(@PathVariable String id){
        return empLeaveService.read(id);
    }
    //Method to update specified employee Leave record
    @PutMapping("/update/{id}")
    public EmployeeLeave update(@RequestBody EmployeeLeave empLeave){
        return empLeaveService.update(empLeave);
    }
    //Method to view all employee Leave records
    @GetMapping("/viewAll")
    public Set<EmployeeLeave> getAll(){
        return empLeaveService.getAll();
    }
    //Method to delete and employee Leave recorda
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        empLeaveService.delete(id);
    }
}
