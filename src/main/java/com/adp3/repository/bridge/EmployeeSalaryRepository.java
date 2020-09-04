package com.adp3.repository.bridge;


import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.repository.IRepository;


import java.util.Set;

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description: EmployeeSalaryRepository
 */
public interface EmployeeSalaryRepository extends IRepository<EmployeeSalary,String> {
    //Retrieves collection specific to EmployeeSalaryRepository
    Set<EmployeeSalary> getAll();
}
