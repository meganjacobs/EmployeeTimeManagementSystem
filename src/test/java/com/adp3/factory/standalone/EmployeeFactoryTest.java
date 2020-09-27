package com.adp3.factory.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

class EmployeeFactoryTest {

    @Test
    public void createEmployee() {
        Employee employee =  EmployeeFactory.createEmployee("Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));

        //test expected empID value in employee object
        assertEquals("231", employee.getEmpID());
        //test expected empName value in employee object
        assertEquals("Malusi", employee.getEmpName());
        //test expected empLastName value in employee object
        assertEquals("Pakade", employee.getEmpLastName());
        //test expected empPhone value in employee object
        assertEquals("021 543 9876", employee.getEmpPhoneNumber());
        //test expected empDOB value in employee object
        assertEquals(new Date(1986, 00, 12)     , employee.getEmpDOB());

       // System.out.println(employee);
    }

}