package com.adp3.service.reports.impl;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
import com.adp3.service.reports.LeaveReportService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: Test methods of LeaveReportService (IService) implemented in its concrete class
 */

//Annotation of executing tests in alphabetical order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LeaveReportServiceImplTest {

    private static LeaveReportService leaveReportService;
    private static LeaveReport leaveReport = LeaveReportFactory.buildLeaveReport("Original request");

    @Test
    public void a_create() {
        LeaveReport created = leaveReportService.create(leaveReport);
        assertEquals(leaveReport.getLeaveReportID(), created.getLeaveReportID());
        System.out.println("Created : " + created);
    }

    @Test
    public void b_read() {
        LeaveReport read = leaveReportService.read(leaveReport.getLeaveReportID());
        System.out.println("Read : " + read);
    }

    @Test
    public void c_update() {
        LeaveReport updated = new LeaveReport.Builder()
                .copy(leaveReport)
                .setLeaveReportDesc("Updated request")
                .build();
        updated = leaveReportService.update(updated);
        System.out.println("Updated : " + updated);
    }

    @Test
    public void e_delete() {
        leaveReportService.delete(leaveReport.getLeaveReportID());
        System.out.println("Deleted :" + leaveReportService.getAll());
    }

    @Test
    public void d_getAll() {
        System.out.println("GetAll : " + leaveReportService.getAll());
    }
}