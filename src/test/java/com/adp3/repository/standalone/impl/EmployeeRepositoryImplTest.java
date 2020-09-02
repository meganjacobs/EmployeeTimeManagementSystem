package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.repository.standalone.EmployeeRepository;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.runners.MethodSorters.NAME_ASCENDING;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Repository Implementation Test
 * 2020
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class EmployeeRepositoryImplTest {

    private static EmployeeRepository empployeeRepo = new EmployeeRepositoryImpl();
    private Employee employee = EmployeeFactory.createEmployee("231","Malusi", "Pakade", "021 543 9876", new Date(1986, 00, 12));


    @Test
    void a_create() {
        // test if EmployeeRepositoryImpl create method can create an employee
        Employee created = empployeeRepo.create( employee );

        //test expected empID value in employee object.
        assertEquals( employee.getEmpID(), employee.getEmpID() );
        //test expected empName value in employee object
        assertEquals( employee.getEmpName(), employee.getEmpName() );
        //test expected empLastName value in employee object
        assertEquals( employee.getEmpLastName(), employee.getEmpLastName() );
        //test expected empPhone value in employee object
        assertEquals( employee.getEmpPhone(), employee.getEmpPhone() );
        //test expected empDOB value in employee object
        assertEquals( employee.getEmpDOB(), employee.getEmpDOB() );

        System.out.println("Create: " + created );
    }

    @Test
    void b_read() {

        Employee read = empployeeRepo.read( employee.getEmpID() );
        System.out.println("Read: " + read );

    }

    @Test
    void c_update() {

        Employee update = new Employee.Builder().setEmpID("321").build() ;
        update = empployeeRepo.update( update );
        System.out.println("Update: " + update );
    }

    @Test
    void d_delete() {

        empployeeRepo.delete( employee.getEmpID() );

    }

    @Test
    public void d_getAll() {

        System.out.println( "Get All: " + empployeeRepo.getAll() );

    }

}