package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeSalary;

/**
 * @author Liesl Gounden-Wentzel
 * desc: Employess Salary Factory - used to create an instance of the class
 */

public class EmployeeSalaryFactory {

    double salary;
    public static EmployeeSalary CalcEmployeeSalary(String empID, double rate, double hours){
        return new EmployeeSalary.Builder()
                .setEmpID(empID)
                .setEmpSalaryRate(rate)
                .setEmpHours(hours)
                .build();


    }

}
