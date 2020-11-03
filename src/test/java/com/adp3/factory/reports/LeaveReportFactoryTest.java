package com.adp3.factory.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        leaveReport = LeaveReportFactory.buildLeaveReport("emp001","001","cpt001");
    }
    @Test
    public void testCreateLeaveReport() {
        //Test object does not return nulls
        Assert.assertNotNull(leaveReport);
        System.out.println(leaveReport);
    }

    @Test
    public void testLeaveReportIDNotNull() {
        // Test leaveReportID is not null
        Assert.assertNotNull(leaveReport.getLeaveReportID());
        System.out.println(leaveReport.getLeaveReportID());
    }
    @Test
    public void testLeaveReportValuesEqual() {
        //Test object values are equal
         Assert.assertEquals(leaveReport.getEmpID(),"emp001");
        System.out.println(leaveReport.getEmpID());

    }





}