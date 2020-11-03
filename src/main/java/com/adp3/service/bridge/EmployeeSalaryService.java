package com.adp3.service.bridge;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.service.IService;

import java.util.Set;

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description: EmployeeSalaryService - extends member methods of parent "IService"
 */

public interface EmployeeSalaryService extends IService <EmployeeSalary, String> {
    Set<EmployeeSalary> getAll();
    Set<EmployeeSalary> calcEmployeeSalary();
}
