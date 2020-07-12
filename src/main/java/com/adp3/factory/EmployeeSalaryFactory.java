package com.adp3.factory;

import com.adp3.entity.EmployeeSalary;

/**
 * @author Liesl Gounden-Wentzel
 * desc: Employess Salary Factory - used to create an instance of the class
 */

public class EmployeeSalaryFactory {

    public static EmployeeSalary getEmployeeSalary(String empID, double rate){
        return new EmployeeSalary.Builder()
                .setEmpID(empID)
                .setEmpSalaryRate(rate)
                .build();

    }

}
