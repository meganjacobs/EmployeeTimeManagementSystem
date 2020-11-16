package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.factory.bridge.EmployeeStoreFactory;
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

import static org.junit.Assert.*;
/**
 * Author: Munyaradzi  Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreControllerTest
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeStoreControllerTest {

    private EmployeeStore employeestore = EmployeeStoreFactory.createEmployeeStore("bebe","A100");
    private static String empID = GenericHelper.generateID();
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/employeestore";
    private String username = "root";
    private String password = "alica2010";

    @Test
    public void a_create() {
       String url = baseURL + "create";
        System.out.println("URL: " + url);
        System.out.println("Post Data: " + employeestore);

        ResponseEntity<EmployeeStore> postResponse =
                restTemplate.postForEntity(url, employeestore, EmployeeStore.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        employeestore = postResponse.getBody();
        System.out.println("Saved Data: " + employeestore);
        assertEquals(employeestore.getEmpID(), postResponse.getBody().getEmpID());

    }

    @Test
    public void b_read() {
        String url = baseURL + "read" + employeestore.getEmpID();
        System.out.println("Read BaseUrl:  " + url);
        restTemplate.getRestTemplate().getForObject(baseURL +
                        "/employeestore/read", EmployeeStore.class);
        System.out.println(employeestore.getEmpID());
        assertNotNull(employeestore);
    }

    @Test // employeeStore update
    public void c_update() {
        EmployeeStore updated = new EmployeeStore.Builder().copy(employeestore).setStoreID("Munya1").build();
        System.out.println("employeeStore Updated : " + updated);
        assertNotNull(employeestore);
        System.out.println(employeestore);
        System.out.println(baseURL);
    }

    @Test
    public void d_getAll() {
        String url = baseURL + "getAll";
        System.out.println("GetAll URL:  " + url);
        HttpHeaders b = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, b);
        ResponseEntity<String> postResponse = restTemplate.withBasicAuth(username,password).exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(postResponse.getBody());
        assertNotNull(postResponse);
    }

    @Test //delete employee empID.
    public void e_delete() {
        String empID = null;
        EmployeeStore employeestore = restTemplate.withBasicAuth(username,password).getForObject(baseURL + "/employeestore//" + empID, EmployeeStore.class);
        assertNotNull(employeestore);
        restTemplate.delete(baseURL + "/employeestore/" + empID);

        try {
            restTemplate.getForObject(baseURL + "/employeestore/" + empID, EmployeeStore.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }
}