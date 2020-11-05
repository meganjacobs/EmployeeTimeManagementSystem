package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.factory.bridge.EmployeeStoreFactory;
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
 * Author: Munyaradzi  Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreControllerTest
 */

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class EmployeeStoreControllerTest {
/*@Autowired
     private String baseURL="http://localhost:8080/employeestore";

    private EmployeeStore employeestore = EmployeeStoreFactory.createEmployeeStore("bebe","A100");
*/
    @Test
    public void a_create() {

     /*   TestRestTemplate restTemplate = null;
        ResponseEntity employeeStoreResponseEntity =
                restTemplate.postForEntity(baseURL+"create", MediaType.APPLICATION_JSON, String.class);
        assertNotNull(employeeStoreResponseEntity);
        assertNotNull(employeeStoreResponseEntity.getBody());
        assertEquals(HttpStatus.OK,employeeStoreResponseEntity.getStatusCode());
        System.out.println("POSTED employeeStore : " + employeeStoreResponseEntity.getBody());
*/
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void delete() {
    }
}