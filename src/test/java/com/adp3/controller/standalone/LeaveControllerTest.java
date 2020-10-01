package com.adp3.controller.standalone;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.entity.standalone.Leave;
import com.adp3.factory.reports.LeaveReportFactory;
import com.adp3.factory.reports.LeaveReportFactoryTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.*;

public class LeaveControllerTest {
    private  LeaveReport leaveReport = LeaveReportFactory.buildLeaveReport("");


    @Autowired
    private TestRestTemplate restTemplate;
    private  String baseUrl = "http://localhost:8080/leaveReporting/";
    private LeaveReport employee =  LeaveReportFactory.buildLeaveReport("");
    @Test
    public void create() {
    }

    @Test
    public void read() {
        String url = baseUrl + "read" + leaveReport.getLeaveReportID();
        System.out.println("Store Read URL:  " + url);
        ResponseEntity<Leave> leaveResponseEntity = restTemplate.getForEntity(url, Leave.class);
        assertNotNull(leaveResponseEntity);
        assertNotNull(leaveResponseEntity.getBody());

    }

    @Test
    public void update() {
       /* Leave updated  = new Leave.Builder().copy(leaveReport).setLeaveDaysAmt(123456).setLeaveDesc("").setLeaveID("").build();
        String url = baseUrl + "update";
         ResponseEntity<Leave> storeResponseEntity = restTemplate.postForEntity(url,updated, Leave.class);
        assertNotNull(storeResponseEntity);
        assertNotNull(updated);

    */}




    @Test
    public void delete() {
        String url = baseUrl + "delete/" + leaveReport.getLeaveReportID();
        restTemplate.delete(url);
    }

    @Test
    public void getAll() {
    }
}