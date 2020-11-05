package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.service.standalone.EmployeeService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;
/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Service Implementation Test
 * 2020
 */

/** responsible for executing methods in alphabetical order */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService emp_service;
    private static  Employee employee = EmployeeFactory.createEmployee("Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));


    @Test
    public void getEmp_service() {

    }

    @Test
    public void d_getAll() {

        System.out.print( "Get All: " + emp_service.getAll() );

    }

    @Test
    public void a_create() {

        // test if EmployeeRepositoryImpl create method can create an employee
        Employee created = emp_service.create( employee );

        //test expected empID value in employee object.
        assertEquals( employee.getEmpID(), employee.getEmpID() );
        //test expected empName value in employee object
        assertEquals( employee.getEmpName(), employee.getEmpName() );
        //test expected empLastName value in employee object
        assertEquals( employee.getEmpLastName(), employee.getEmpLastName() );
        //test expected empPhone value in employee object
        assertEquals( employee.getEmpPhoneNumber(), employee.getEmpPhoneNumber() );
        //test expected empDOB value in employee object
        assertEquals( employee.getEmpDOB(), employee.getEmpDOB() );

        System.out.println("Created: " + created );

    }

    @Test
    public void b_read() {

        Employee read = emp_service.read( employee.getEmpID() );
        System.out.println("Read: " + read );

    }

    @Test
    public void c_update() {

        Employee update = new Employee.Builder().copy(employee).setEmpID("400").build() ;
        update = emp_service.update( update );
        System.out.println("Updated: " + update );

    }

    @Test
    public void e_delete() {

        emp_service.delete( employee.getEmpID() );

    }
}
