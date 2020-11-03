package com.adp3.service.reports.impl;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
import com.adp3.service.reports.LeaveReportService;
import org.hibernate.Session;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: Test methods of LeaveReportService (IService) implemented in its concrete class
 */

//Annotation for executing tests in alphabetical order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
@RunWith(SpringRunner.class)
public class LeaveReportServiceImplTest {

    @Autowired
    LeaveReportService leaveReportService;
    LeaveReport leaveReport;

    @Before
    public void setup() {
        leaveReport = LeaveReportFactory.buildLeaveReport("emp001", "001", "cpt001");
        leaveReportService.create(leaveReport);
    }

    @Test
    public void a_create() {
        LeaveReport created = leaveReportService.create(leaveReport);
        System.out.println("Created : " + created);
        Assert.notNull(created, ("Created : " + created));
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
                .setEmpID("emp002")
                .setLeaveID("002")
                .setStoreID("cpt002")
                .build();
        updated = leaveReportService.update(updated);
        System.out.println("Updated : " + updated);
    }

    @Test
    public void e_delete() {
        leaveReportService.delete(leaveReport.getLeaveReportID());
        Assert.hasText(leaveReport.getEmpID(),("Deleted :" + leaveReport.getLeaveReportID()));
        System.out.println(("Deleted leaveReportID: " + leaveReport.getLeaveReportID()));
    }

    @Test
    public void d_getAll() {
        Assert.notEmpty(leaveReportService.getAll(),"GetAll : " + leaveReportService.getAll());
        System.out.println("GetAll : " + leaveReportService.getAll());
    }
}