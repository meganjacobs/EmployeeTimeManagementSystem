package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.factory.bridge.EmployeeSalaryFactory;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;
/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description: EmployeeSalaryServiceImpl Test
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeSalaryServiceImplTest {

    @Autowired
    private EmployeeSalaryServiceImpl service;
    //private static String empID = GenericHelper.generateID();
    private EmployeeSalary empSal;

    @Before
    public void setup (){
        empSal = EmployeeSalaryFactory.buildEmployeeSalary("A1234",56.23,45);
        service.create(empSal);
    }

    @Test
    public void d_getAll() {
        Set<EmployeeSalary> empsals = service.getAll();
        //assertEquals(1, empsals.size());
        System.out.println("All: "+ empsals);
    }

    @Test
    public void a_create() {
        EmployeeSalary created = service.create(empSal);
        //assertEquals(empSal.getEmpSalID(), created.getEmpSalID());
        System.out.println("CREATE: " + created);
    }

    @Test
    public void b_read() {
        EmployeeSalary read = service.read(empSal.getEmpSalId());
        System.out.println("READ: " + read);
    }

    @Test
    public void c_update() {
        EmployeeSalary updated = new EmployeeSalary.Builder().copy(empSal).setEmpHours(41).setEmpRate(40.2).build();
        updated = service.update(updated);
        //Assert.assertEquals(empSal.getEmpID(),updated.getEmpID());
        //Assert.assertNotEquals(empSal.getEmpHours(),updated.getEmpHours());
        System.out.println("UPDATED: "+ updated);
    }

    @Test
    public void e_delete() {
        service.delete(empSal.getEmpSalId());
        //Assert.assertTrue(deleted);
        System.out.println("DELETED: " + service.getAll());
    }
}