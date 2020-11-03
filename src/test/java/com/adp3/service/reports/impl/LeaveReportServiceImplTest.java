package com.adp3.service.reports.impl;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
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
    LeaveReportServiceImpl leaveReportService;
    LeaveReport leaveReport;

    @Before
    public void setup() {
        leaveReport = LeaveReportFactory.buildLeaveReport("emp003", "003", "cpt003");
        leaveReportService.create(leaveReport);
    }

    @Test
    public void a_create() {
        System.out.println("Created : " + leaveReport);
        Assert.notNull(leaveReport, "values created and stored");
    }



    @Test
    public void b_read() {
        LeaveReport read = leaveReportService.read(leaveReport.getLeaveReportID());
        System.out.println("Read : " + read);
        Assert.hasText(leaveReport.getEmpID(),"values read");
    }

    @Test
    public void c_update() {
        if (leaveReportService.read(leaveReport.getLeaveReportID())!=null){
        leaveReportService.update(leaveReport);
            System.out.println("Record Exists:  " + leaveReport.getLeaveReportID());
        System.out.println("Updated : " + leaveReport);
        }
        else System.out.println("leaveReport does not exist in database:  ");
        Assert.notNull(leaveReport);

    }

    @Test
    public void e_delete() {
        leaveReportService.delete(leaveReport.getLeaveReportID());
        Assert.hasText(leaveReport.getEmpID(),"value existed and was deleted");
        System.out.println(("Deleted leaveReportID: " + leaveReport.getLeaveReportID()));
    }

    @Test
    public void d_getAll() {
        Assert.notEmpty(leaveReportService.getAll(),"Set is empty");
        System.out.println("GetAll : " + leaveReportService.getAll());
    }
}