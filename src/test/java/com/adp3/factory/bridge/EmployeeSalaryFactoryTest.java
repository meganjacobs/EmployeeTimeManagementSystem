package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeSalary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * @author Liesl Gounden-Wentzel
 * desc: Employess Salary Factory Test - tests that an object is instantiated and getters are working
 */

public class EmployeeSalaryFactoryTest {

    EmployeeSalary empSal = EmployeeSalaryFactory.buildEmployeeSalary("A23",56.23, 45);

    @Test // Testing Date
    public void getDate() throws Exception {

        //assertEquals(,empSal.getDate());
        System.out.println("Date:" +empSal.getDate());

    }

    @Test // Testing EmployeeId
    public void getEmployeeId() throws Exception {

        assertSame("A23",empSal.getEmpID());
        System.out.println("Employee ID: " +empSal.getEmpID());

    }

    @Test
    public void getEmployeeSalary() throws Exception {


        //double rate = empSal.getEmpSalary();
        //double hours = empSal.getEmpHours();
        double salary = empSal.getEmpRate() * empSal.getEmpHours();

        assertEquals(2530.35, salary,0.1); // will pass
        System.out.println("Employee Salary : R" + salary);


    }
    }
