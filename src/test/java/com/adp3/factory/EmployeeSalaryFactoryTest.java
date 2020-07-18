package com.adp3.factory;

import com.adp3.entity.bridging.EmployeeSalary;
import com.adp3.factory.bridging.EmployeeSalaryFactory;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Liesl Gounden-Wentzel
 * desc: Employess Salary Factory Test - tests that an object is instantiated and getters are working
 */

public class EmployeeSalaryFactoryTest {

    EmployeeSalary empSal = EmployeeSalaryFactory.CalcEmployeeSalary("A23",56.23);

    @Test // Testing Object Identity
    public void getEmployeeID() throws Exception {

            assertSame("A23",empSal.getEmpID());

        }

    @Test
    public void getEmployeeSalary() throws Exception {


        double rate = empSal.getEmpSalary();
        int hours = 45;
        double salary = rate*hours;

        assertEquals(2530.35, salary,0.1); // will pass


    }
    }
