package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeLeave;

import com.adp3.factory.bridge.EmployeeLeaveFactory;

import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeLeaveControllerTest {


    private static String empID = GenericHelper.generateID();
    private static EmployeeLeave employeeLeave = EmployeeLeaveFactory.calcEmployeeLeave(empID,"3",new Date(2020,6,02), new Date(2020,6,05));


    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURl = "http://localhost:8080/employeeLeave/";


    @Test
    public void a_create() {


        String url = baseURl + "create";
        System.out.println("URL: " + url);
        System.out.println("Post Info: " + employeeLeave);
        System.out.println("ID: "+ employeeLeave.getEmpID());
        ResponseEntity<EmployeeLeave> leaveResponseEntity = restTemplate.postForEntity(url, employeeLeave, EmployeeLeave.class);
        assertNotNull(leaveResponseEntity);
        assertNotNull(leaveResponseEntity.getBody());
        employeeLeave = leaveResponseEntity.getBody();
        System.out.println("Saved data: " + employeeLeave);
        assertEquals(employeeLeave.getEmpID(),leaveResponseEntity.getBody().getEmpID());
    }

    @Test
    public void b_read() {

        String url = baseURl + "read" + employeeLeave.getEmpID();
        System.out.println("EmployeeLeave Read URL:  " + url);
        ResponseEntity<EmployeeLeave> leaveResponseEntity = restTemplate.getForEntity(url, EmployeeLeave.class);
        assertNotNull(leaveResponseEntity);
        assertNotNull(leaveResponseEntity.getBody());
    }

    @Test
    public void update() {
        EmployeeLeave updatedRecord = new EmployeeLeave.Builder().copy(employeeLeave).setLeaveID("3").build();
        String url = baseURl + "update";
        System.out.println("URL:  " + url);
        System.out.println("Updated Leave Type: " + employeeLeave.getEmpID());
        ResponseEntity<EmployeeLeave> ResponseEntity = restTemplate.postForEntity(url,updatedRecord, EmployeeLeave.class);
        assertNotNull(ResponseEntity);
        assertNotNull(updatedRecord);
        System.out.println("New Leave Record: " + employeeLeave.getEmpID() );
    }

    @Test
    public void getAll() {
        String url = baseURl + "viewAll" ;
        System.out.println("View all URL:  " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);
    }

    @Test
    public void delete() {
        String url = baseURl + "delete" + employeeLeave.getEmpID();
        System.out.println("URL:  " + url);
        restTemplate.delete(url);
    }
}