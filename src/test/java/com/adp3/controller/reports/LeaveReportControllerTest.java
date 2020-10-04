package com.adp3.controller.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Controller: LeaveReportControllerTest - test all methods using PostMapping, GetMapping, PutMapping & DeleteMapping
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class LeaveReportControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/leaveReport/";

    private LeaveReport leaveReport = LeaveReportFactory.buildLeaveReport("compassionate");

    @Test
    public void a_create(){ // Test PostMapping
         ResponseEntity leaveReportResponseEntity =
                restTemplate.postForEntity(baseURL+"create", MediaType.APPLICATION_JSON, String.class);
        assertNotNull(leaveReportResponseEntity);
        assertNotNull(leaveReportResponseEntity.getBody());
        assertEquals(HttpStatus.OK,leaveReportResponseEntity.getStatusCode());
        System.out.println("POSTED LeaveReport : " + leaveReportResponseEntity.getBody());
    }

    @Test
    public void b_read() { // Test GetMapping
        ResponseEntity<LeaveReport> leaveReportResponseEntity =
                restTemplate.getForEntity(baseURL + "read"+ leaveReport.getLeaveReportID(), LeaveReport.class);
        assertNotNull(leaveReportResponseEntity);
        assertNotNull(leaveReportResponseEntity.getBody());
        System.out.println("GET LeaveReport URL: "+baseURL+":"+leaveReport.getLeaveReportID());
    }

    @Test
    public void c_update() {
        restTemplate.getForObject(baseURL + "/updated/" + leaveReport.getLeaveReportID(), LeaveReport.class);
        restTemplate.put(baseURL + "/leaveReports/" + leaveReport.getLeaveReportID(), leaveReport );
        LeaveReport updatedLeaveReport =
                restTemplate.getForObject(baseURL + "/LeaveReport/" + leaveReport.getLeaveReportID(), LeaveReport.class);
        assertNotNull(updatedLeaveReport);
        System.out.println("PUT LeaveReport URL: ");
    }

    @Test
    public void e_delete() {
        restTemplate.delete(baseURL+"delete"+leaveReport.getLeaveReportID());
        System.out.println("LeaveReport Deleted:  " + baseURL+"delete"+leaveReport.getLeaveReportID());
    }

    @Test
    public void d_getAll() {
        ResponseEntity result = restTemplate.withBasicAuth("Megan", "Password")
                .getForEntity(baseURL + "/getAll", String.class);
        System.out.println(result.getBody());
        Assert.assertEquals(HttpStatus.OK, result.getStatusCodeValue());
    }
}