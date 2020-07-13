package com.adp3.factory;

import com.adp3.entity.LeaveReport;
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
        leaveReport = LeaveReportFactory.createLeaveReport("001","Sick Leave");
    }
    @Test
    public void testCreateLeaveReport() {
        //Test object does not return nulls
        Assert.assertNotNull(leaveReport);
    }

    @Test
    public void testLeaveReportIDNotNull() {
        // Test leaveReportID is not null
        Assert.assertNotNull(leaveReport.getLeaveReportID());
    }
    @Test
    public void testLeaveReportValuesEqual() {
        //Test object values are equal
        Assert.assertEquals(leaveReport.getLeaveID(), "001");
        Assert.assertEquals(leaveReport.getLeaveReportDesc(),"Sick Leave");

    }





}