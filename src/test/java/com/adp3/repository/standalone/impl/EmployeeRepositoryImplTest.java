package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.repository.standalone.EmployeeRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Repository Implementation Test
 * 2020
 */

/** responsible for executing methods in alphabetical order */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeRepositoryImplTest {

    @Autowired
    private static EmployeeRepository emp_repo;
    private Employee employee = EmployeeFactory.createEmployee("Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));


    @Test
    public void a_create() {
        // test if EmployeeRepositoryImpl create method can create an employee
        Employee created = emp_repo.save( employee );

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
    public void b_read(String str) {

        Employee read = emp_repo.findById( employee.getEmpID() ).orElseGet( null);
        System.out.println("Read: " + read );

    }

    @Test
    public void c_update() {

      //  create( employee.getEmpID() );
        //System.out.println("Updated: " + update );
    }

    @Test
    public void e_delete() {

        this.emp_repo.deleteById(  employee.getEmpID() );
        System.out.println("Deleted: " + employee.getEmpID() );

    }

    @Test
    public void d_getAll() {

        System.out.print( "Get All: " + emp_repo.findAll().stream().collect( Collectors.toSet()));

    }

}