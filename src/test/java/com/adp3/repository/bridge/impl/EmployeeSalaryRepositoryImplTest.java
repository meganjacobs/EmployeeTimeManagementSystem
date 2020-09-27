package com.adp3.repository.bridge.impl;

import com.adp3.entity.bridge.EmployeeSalary;
import com.adp3.factory.bridge.EmployeeSalaryFactory;
import com.adp3.repository.bridge.EmployeeSalaryRepository;
import com.adp3.util.GenericHelper;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description: EmployeeSalaryRepositoryImpl Test
 */
public class EmployeeSalaryRepositoryImplTest {

    private static EmployeeSalaryRepository repo = new EmployeeSalaryRepositoryImpl();
    private static String empID = GenericHelper.generateID();
    private static EmployeeSalary empSal = EmployeeSalaryFactory.buildEmployeeSalary(empID,56.23,45);



    @Test
    public void a_create() {
        EmployeeSalary created = repo.create(empSal);
        Assert.assertEquals(empSal.getEmpID(), created.getEmpID());
        System.out.println("CREATED: "+ created);
    }

    @Test
    public void b_read() {
        EmployeeSalary read = repo.read(empSal.getEmpID());
        System.out.println("READ: " + read);

    }

    @Test
    public void c_update() {
        EmployeeSalary updated = new EmployeeSalary.Builder().copy(empSal).setEmpHours(41).setEmpSalaryRate(40.2).build();
        updated = repo.update(updated);
        Assert.assertEquals(empSal.getEmpID(),updated.getEmpID());
        Assert.assertNotEquals(empSal.getEmpHours(),updated.getEmpHours());
        System.out.println("UPDATED: "+ updated);
    }

    @Test
    public void e_delete() {
        repo.delete(empSal.getEmpID());
        //Assert.assertTrue(deleted);
        System.out.println("DELETED: " + repo.getAll());

    }

    @Test
    public void d_getAll() {
        System.out.println("GET ALL: "+repo.getAll());
    }
}