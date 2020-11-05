package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.factory.bridge.EmployeeStoreFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
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


    private EmployeeStore employeestore = EmployeeStoreFactory.createEmployeeStore("bebe","A100");
    @Autowired
    private String baseURL="http://localhost:8080/employeestore";
    private TestRestTemplate restTemplate;
    @Test
    public void a_create() {

        String url = baseURL + "create";
        System.out.println("URL: " + url);
        System.out.println("Post Info: " + employeestore);

        System.out.println("ID: "+ employeestore.getEmpID());


        ResponseEntity<EmployeeStore> employeeStoreResponseEntity
                = restTemplate.postForEntity(url, employeestore, EmployeeStore.class);
        assertNotNull(employeeStoreResponseEntity);

        assertNotNull(employeeStoreResponseEntity.getBody());
        employeestore = employeeStoreResponseEntity.getBody();
        System.out.println("Saved data: " + employeestore);
        assertEquals(employeestore.getEmpID(), employeeStoreResponseEntity.getBody().getEmpID());
    }

    @Test
    public void b_read() {
        String url = baseURL + "read" + employeestore.getEmpID();
        System.out.println("EmployeeStore Read URL:  " + url);
        ResponseEntity<EmployeeStore> employeeStoreResponseEntity = restTemplate.getForEntity(url, EmployeeStore.class);
        assertNotNull(employeeStoreResponseEntity);
        assertNotNull(employeeStoreResponseEntity.getBody());
    }

    @Test
    public void c_update() {
        EmployeeStore updatedRecord = new EmployeeStore.Builder().copy(employeestore).setStoreID("3").build();
        String url = baseURL + "update";
        System.out.println("URL:  " + url);
        System.out.println("Updated Store Type: " + employeestore.getEmpID());
        ResponseEntity<EmployeeStore> ResponseEntity = restTemplate.postForEntity(url,updatedRecord, EmployeeStore.class);
        assertNotNull(ResponseEntity);
        assertNotNull(updatedRecord);
        System.out.println("New Store Record: " + employeestore.getEmpID() );

    }

    @Test
    public void d_getAll() {
        String url = baseURL + "viewAll" ;
        System.out.println("View all URL:  " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);
    }

    @Test
    public void e_delete() {
        /*String url = baseURL + "delete" + employeestore.getEmpID();
        System.out.println("URL:  " + url);
        restTemplate.delete(url);*/

         // Test DeleteMapping
            restTemplate.delete(baseURL + "delete/" + employeestore.getEmpID());
            System.out.println("DELETED EmployeeStore :  " +employeestore.getEmpID());
    }
}