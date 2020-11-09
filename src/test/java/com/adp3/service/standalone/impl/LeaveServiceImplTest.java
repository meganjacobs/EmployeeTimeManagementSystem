package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Leave;
import com.adp3.factory.standalone.LeaveFactory;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
/**
 * Author: Ayanda Nongxa
 * desc: Leave Service Implementation Tests
 * Class: Part Time
 * *Student number: 204513723
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LeaveServiceImplTest {

    @Autowired
    LeaveServiceImpl leaveService;
    Leave leave;

    @Before
    public void setupLeave() {
        leave = LeaveFactory.createLeave("Annual");
        this.leaveService.create(leave);
    }
    @Test
    public void a_create() {
        assertNotNull(leave);
        System.out.println("Create Leave: " + leave);
    }

    @Test
    public void b_read() {
        this.leaveService.read(leave.getLeaveID());
        System.out.println("Read Leave: " + leave);
    }

    @Test
    public void c_update() {
        this.leaveService.update(leave);
        System.out.println("Updated Leave: " + leave);
    }

    @Test
    public void e_delete() {
        this.leaveService.delete(leave.getLeaveID());
        System.out.println("Delete:  " + leave.getLeaveID() + "record");

    }

    @Test
    public void d_getAll() {
        System.out.println(this.leaveService.getAll());
    }

}