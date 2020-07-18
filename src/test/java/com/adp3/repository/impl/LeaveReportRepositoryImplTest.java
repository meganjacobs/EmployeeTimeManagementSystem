package com.adp3.repository.impl;

import com.adp3.entity.Leave;
import com.adp3.entity.LeaveReport;
import com.adp3.factory.LeaveReportFactory;
import com.adp3.repository.LeaveReportRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: Test methods of LeaveReportRepository (Repository) implemented in its concrete class
 */

//Annotation of executing tests in alphabetical order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LeaveReportRepositoryImplTest {

    private static LeaveReportRepository repository = new LeaveReportRepositoryImpl();
    private LeaveReport leaveReport = LeaveReportFactory.buildLeaveReport("Family Responsibility");

    @Test
    public void a_create() {
        LeaveReport created = repository.create(leaveReport);
        assertEquals(leaveReport.getLeaveReportID(), created.getLeaveReportID());
        System.out.println("Created : " + created);
    }

    @Test
    public void b_read() {
        LeaveReport read = repository.read(leaveReport.getLeaveReportID());
        System.out.println("Read : " + read);

    }

    @Test
    public void c_update() {
        LeaveReport updated = new LeaveReport.Builder()
                .copy(leaveReport)
                .setLeaveReportDesc("Sick Leave")
                .build();
        System.out.println("Updated : " + updated);
    }

    @Test
    public void e_delete() {
        repository.delete(leaveReport.getLeaveReportID());
    }

    @Test
    public void d_getAll() {
        System.out.println(repository.getAll());
    }
}