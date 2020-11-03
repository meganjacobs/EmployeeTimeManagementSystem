package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.repository.bridge.EmployeeSalaryRepository;
import com.adp3.service.bridge.EmployeeSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description:EmployeeSalaryServiceImpl - implementation of EmployeeSalaryService as a concrete class
 */

@Service
public class EmployeeSalaryServiceImpl implements EmployeeSalaryService {



    @Autowired
    private EmployeeSalaryRepository repository;



    @Override
    public Set<EmployeeSalary> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public EmployeeSalary create(EmployeeSalary empSal) {
        return this.repository.save(empSal);
    }

    @Override
    public EmployeeSalary read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public EmployeeSalary update(EmployeeSalary t) {
        if( this.repository.existsById(t.getEmpID())){
        return this.repository.save(t);}
        return null;
    }

    @Override
    public void delete(String s) {
        repository.deleteById(s);


    }
    public Set<EmployeeSalary> calcEmployeeSalary(){
        Set<EmployeeSalary> rate = getAll();
        Set<EmployeeSalary> salary = new HashSet<>();
        for (EmployeeSalary sal: rate){
            double calc = sal.getEmpHours() * sal.getEmpRate();
            salary.add(sal);
        }

        return salary;
    }



}
