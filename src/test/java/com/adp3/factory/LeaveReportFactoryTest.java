package com.adp3.factory;

import com.adp3.entity.Employee;
import com.adp3.entity.Leave;
import com.adp3.entity.LeaveReport;
import com.adp3.util.GenericHelper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Test: LeaveReportFactory
 */
public class LeaveReportFactoryTest {
    private LeaveReport leaveReport;

    @Before
    public void setUp() throws Exception {
        this.leaveReport = new LeaveReport.Builder().build();
    }
    @Test
    public void testCreateLeaveReport() {
        leaveReport = LeaveReportFactory.createLeaveReport("001","Sick Leave");
        // Test leaveReportID is not null
        Assert.assertNotNull(leaveReport.getLeaveReportID());

        //Test object does not return nulls
        Assert.assertNotNull(leaveReport);

        //Test object values are equal
        Assert.assertEquals(leaveReport.getLeaveID(), "001");
        Assert.assertEquals(leaveReport.getLeaveReportDesc(),"Sick Leave");

    }





}