package com.adp3.factory.standalone;

import com.adp3.entity.standalone.Employee;

import java.util.Date;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Factory
 * 2020
 */

public class EmployeeFactory {

    public static Employee createEmployee(String empID, String  empName, String empLastName, String empPhoneNumber, Date empDOB){
        return new Employee.Builder()
                .setEmpID(empID)
                .setEmpName(empName)
                .setEmpDOB(empDOB)
                .setEmpLastName(empLastName)
                .setEmpPhoneNumber(empPhoneNumber)
                .build();
    }

}
