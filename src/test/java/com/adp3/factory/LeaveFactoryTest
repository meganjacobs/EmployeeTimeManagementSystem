package com.adp3.factory;

import com.adp3.entity.Leave;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number:204513723
 * Class Description: LeaveFactoryTest
 */
public class LeaveFactoryTest {
        Leave leave;
    @Before
    public void setUp() throws Exception {
        leave = LeaveFactory.createLeave("Annual",3);
    }

    @Test
    public void createLeave() {
        assertSame("Annual", leave.getLeaveDesc());
        assertEquals(3, leave.getLeaveDaysAmt());
        assertNotNull(leave.getLeaveID());
    }

}