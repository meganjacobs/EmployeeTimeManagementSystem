package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.service.standalone.EmployeeService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;
/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Service Implementation Test
 * 2020
 */

/** responsible for executing methods in alphabetical order */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceImplTest {

    @Autowired
     EmployeeServiceImpl emp_service;
     Employee employee = EmployeeFactory.createEmployee("Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));


    @Test
    public void d_getAll() {

        Set<Employee> employees = emp_service.getAll();
       // assertEquals(1, employees.size());
        System.out.print( "Get All: " + employees );

    }

    @Test
    public void a_create() {

        Employee emp_created = emp_service.create( employee );
        Assert.assertEquals( employee.getEmpID(), emp_created.getEmpID() );
        System.out.println("Created Employee: " + employee );

    }

    @Test
    public void b_read() {

        Employee read = emp_service.read( employee.getEmpID() );
        System.out.println("Read: " + read );

    }

    @Test
    public void c_update() {

        Employee update = new Employee.Builder().copy(employee).setEmpLastName("Gigaba").setEmpID("400").build() ;
        update = emp_service.update( update );
        System.out.println("Updated: " + update );

    }

    @Test
    public void e_delete() {

        emp_service.delete( employee.getEmpID() );
        System.out.println("Deleted: "+ employee.getEmpID());
        System.out.print( "Get All: " +  emp_service.getAll() );

    }
}
