package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.factory.bridge.EmployeeLeaveFactory;
import com.adp3.factory.standalone.StoreFactory;
import com.adp3.service.bridge.EmpLeaveService;
import com.adp3.util.GenericHelper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpLeaveServiceImplTest {

    @Autowired
    private static EmpLeaveServiceImpl service;
    private static String empID = GenericHelper.generateID();
    EmployeeLeave empLeave;

    @Before
    public void setup(){
        empLeave = EmployeeLeaveFactory.calcEmployeeLeave("A212","3",new Date(2020,6,02), new Date(2020,6,05));
        service.create(empLeave);
    }

    @Test
    public void a_create() {

        EmployeeLeave created = service.create(empLeave);
        Assert.assertEquals(empLeave.getEmpID(), created.getEmpID());
        System.out.println("CREATED: "+ created);

    }

    @Test
    public void b_read() {

        EmployeeLeave read = service.read(empLeave.getEmpID());
        System.out.println("READ: " + read);

    }

    @Test
    public void c_update() {

        EmployeeLeave updated = new EmployeeLeave.Builder().copy(empLeave).setLeaveID("1").setStartDate(new Date(2020,6,02))
                .setEndDate(new Date(2020,6,05)).build();
        updated = service.update(updated);
        System.out.println("UPDATED: "+ updated);
    }

    @Test
    public void e_delete() {

        service.delete(empLeave.getEmpID());
        System.out.println("RECORD HAS BEEN DELETED"  );
    }

    @Test
    public void d_getAll() {

        Set<EmployeeLeave> employeeLeaves = service.getAll();
        assertEquals(1,employeeLeaves.size());
        System.out.println("TOTAL LEAVE TAKEN:" + employeeLeaves.size());
    }

    /*@Test
    public void empLeave() throws ParseException {


    }*/
}