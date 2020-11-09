package com.adp3.controller.reports;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.bridge.EmployeeLeaveFactory;
import com.adp3.factory.bridge.EmployeeStoreFactory;
import com.adp3.factory.reports.LeaveReportFactory;
import com.adp3.service.bridge.impl.EmpLeaveServiceImpl;
import com.adp3.service.bridge.impl.EmployeeStoreServiceImpl;
import com.adp3.service.standalone.impl.EmployeeServiceImpl;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

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
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LeaveReportControllerTest {

    @Autowired
    TestRestTemplate restTemplate;
    @Autowired
    EmpLeaveServiceImpl empLeaveService;
    @Autowired
    EmployeeStoreServiceImpl employeeStoreService;
    String baseURL="http://localhost:8080/leaveReport/";
    private ResponseEntity leaveReportResponseEntity = null;
    LeaveReport leaveReport;

    @Before
    public void setup() {

        leaveReport = LeaveReportFactory.buildLeaveReport("emp001", "001", "cpt001");
        EmployeeLeave employeeLeave = EmployeeLeaveFactory.calcEmployeeLeave(leaveReport.getEmpID(),leaveReport.getLeaveID(),new Date(),new Date());
        EmployeeStore employeeStore = EmployeeStoreFactory.createEmployeeStore(leaveReport.getEmpID(),leaveReport.getStoreID());
        empLeaveService.create(employeeLeave);
        employeeStoreService.create(employeeStore);
    }
    @Test
    public void a_create(){ // Test PostMapping

         leaveReportResponseEntity =
                restTemplate.withBasicAuth("Super", "Password.ADP3").postForEntity(baseURL + "create/", leaveReport,LeaveReport.class);
        //assertNotNull(leaveReportResponseEntity.getBody());
        System.out.println("POST LeaveReport : " + leaveReportResponseEntity.getBody());
    }

    @Test
    public void b_read() { // Test GetMapping
         leaveReportResponseEntity =
                restTemplate.withBasicAuth("User", "Password").getForEntity(baseURL + "read/"+ leaveReport.getLeaveReportID(), LeaveReport.class);
         System.out.println("GET LeaveReport : "+ leaveReport);
    }

    @Test
    public void c_update() { // Test PutMapping
        LeaveReport original =
        restTemplate.getForObject(baseURL + "read/" + leaveReport.getLeaveReportID(), LeaveReport.class);
        System.out.println("Original leaveReport:  " + leaveReport);
        if (leaveReport.getLeaveReportID()!= null){
            LeaveReport updated = new LeaveReport.Builder()
                    .copy(leaveReport)
                    .setEmpID("emp009")
                    .setLeaveID("009")
                    .setStoreID("cpt009")
                    .build();

        restTemplate.withBasicAuth("Super", "Password.ADP3").put(baseURL + "update/" + "updated", updated);
            assertNotNull(updated);
        System.out.println("PUT LeaveReport : " + updated); }
    }

    @Test
    public void e_delete() { // Test DeleteMapping
        restTemplate.withBasicAuth("Super", "Password.ADP3").delete(baseURL + "delete/" + leaveReport.getLeaveReportID());
        System.out.println("DELETED LeaveReport :  " +leaveReport.getLeaveReportID());
    }

    @Test
    public void d_getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<LeaveReport> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> result = restTemplate.withBasicAuth("User", "Password")
                .exchange(baseURL + "getAll/", HttpMethod.GET,entity, String.class);
            System.out.println("GETall LeaveReport: " + result.getBody());
    }
}