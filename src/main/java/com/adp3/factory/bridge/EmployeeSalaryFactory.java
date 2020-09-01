package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeSalary;

/**
 * @author Liesl Gounden-Wentzel
 * desc: Employess Salary Factory - used to create an instance of the class
 */

public class EmployeeSalaryFactory {

    public static EmployeeSalary CalcEmployeeSalary(String empID, double rate){
        return new EmployeeSalary.Builder()
                .setEmpID(empID)
                .setEmpSalaryRate(rate)
                .build();

    }

}
