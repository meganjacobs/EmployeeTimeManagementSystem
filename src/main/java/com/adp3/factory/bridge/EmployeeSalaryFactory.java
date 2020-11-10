package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeSalary;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Liesl Gounden-Wentzel
 * desc: Employess Salary Factory - used to create an instance of the class
 */

public class EmployeeSalaryFactory {


    public static EmployeeSalary buildEmployeeSalary(String empID, double rate, double hours){

        Date d = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String date = formatter.format(d);
        String empSalId = date+empID;
        return new EmployeeSalary.Builder()
                .setEmpSalId(empSalId)
                .setDate(date)
                .setEmpID(empID)
                .setEmpRate(rate)
                .setEmpHours(hours)
                .setEmpSalary(rate*hours)
                .build();


    }

}
