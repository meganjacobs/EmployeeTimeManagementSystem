package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeRoleControllerTest {

    private static String empId = GenericHelper.generateID();

    private static EmployeeRole employeeRole = EmployeeRoleFactory.createEmployeeRole(empId, "Chief Manager");

    @Autowired
    private TestRestTemplate testRestTemplate;
    private String baseURL = "http://localhost:8080/employeeManagementSystem/employeeRole/";
    private String username = "Super";
    private String password = "Password.ADP3";


    @Test //create EmpRole test via code
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL: " + url);
        System.out.println("Saved data" + employeeRole);
        ResponseEntity<EmployeeRole> postResponse = testRestTemplate.withBasicAuth(username,password).postForEntity(url , employeeRole, EmployeeRole.class);
        System.out.println(postResponse.toString());
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        employeeRole= postResponse.getBody();
        //assertEquals(employeeRole.getEmpID(),empId);
        assertEquals(HttpStatus.OK,postResponse.getStatusCode());
        System.out.println(baseURL);
        System.out.println("Posted data" + employeeRole);

    }

    @Test //read id created
    public void b_read() {
        String url = baseURL + "read" + employeeRole.getEmpID();
        System.out.println("Read BaseUrl:  " + url);
        testRestTemplate.getRestTemplate().getForObject(baseURL + "/employeeRole/read", EmployeeRole.class);
        System.out.println(employeeRole.getEmpID());
        assertNotNull(employeeRole);
    }

    @Test //update employee role
    public void c_update() {
        EmployeeRole employeeRoleUpdate = new EmployeeRole.Builder().copy(employeeRole).setRoleId("Manager").build();
        assertNotNull(employeeRoleUpdate);
        System.out.println(employeeRoleUpdate);
        System.out.println(baseURL);
    }

    @Test //deleting employee via id
    public void e_delete() {
        String empId = null;
        EmployeeRole employeeRole = testRestTemplate.withBasicAuth(username,password).getForObject(baseURL + "/employeeRole//" + empId, EmployeeRole.class);
        assertNotNull(employeeRole);
        testRestTemplate.delete(baseURL + "/employeeRole/" + empId);

        try {
            testRestTemplate.getForObject(baseURL + "/employeeRole/" + empId, EmployeeRole.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test //display all created empRoles
    public void d_getAll() {
        String url = baseURL + "getAll";
        System.out.println("GetAll URL:  " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = testRestTemplate.withBasicAuth(username,password).exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);
    }
}