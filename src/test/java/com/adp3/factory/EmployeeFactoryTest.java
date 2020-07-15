package com.adp3.factory;

import com.adp3.entity.Employee;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        Employee employee =  EmployeeFactory.getEmployee("231","Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));

        assertEquals("231", employee.getEmpID());
        assertEquals("Malusi", employee.getEmpName());
        assertEquals("Pakade", employee.getEmpLastName());
        assertEquals("021 543 9876", employee.getEmpPhone());
        assertEquals(new Date(1986, 00, 12)     , employee.getEmpDOB());
        System.out.println(employee);
    }
    
}