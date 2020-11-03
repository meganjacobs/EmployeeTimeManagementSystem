package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.factory.bridge.EmployeeSalaryFactory;
import com.adp3.service.bridge.EmployeeSalaryService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static org.junit.Assert.assertEquals;
/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description: EmployeeSalaryServiceImpl Test
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeSalaryServiceImplTest {

    @Autowired
    private static EmployeeSalaryService service;
    //private static String empID = GenericHelper.generateID();
    private static EmployeeSalary empSal = EmployeeSalaryFactory.buildEmployeeSalary("A1234",56.23,45);


    @Test
    public void d_getAll() {
        Set<EmployeeSalary> empsals = service.getAll();
        assertEquals(1, empsals.size());
        System.out.println("All: "+ empsals);
    }

    @Test
    public void a_create() {
        EmployeeSalary created = service.create(empSal);
        Assert.assertEquals(empSal.getEmpID(), created.getEmpID());
        System.out.println("CREATE: " + created);
    }

    @Test
    public void b_read() {
        EmployeeSalary read = service.read(empSal.getEmpID());
        System.out.println("READ: " + read);
    }

    @Test
    public void c_update() {
        EmployeeSalary updated = new EmployeeSalary.Builder().copy(empSal).setEmpHours(41).setEmpRate(40.2).build();
        updated = service.update(updated);
        Assert.assertEquals(empSal.getEmpID(),updated.getEmpID());
        Assert.assertNotEquals(empSal.getEmpHours(),updated.getEmpHours());
        System.out.println("UPDATED: "+ updated);
    }

    @Test
    public void e_delete() {
        service.delete(empSal.getEmpID());
        //Assert.assertTrue(deleted);
        System.out.println("DELETED: " + service.getAll());
    }
}