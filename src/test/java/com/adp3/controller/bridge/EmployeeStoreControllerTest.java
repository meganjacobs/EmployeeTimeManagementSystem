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

import static org.junit.Assert.assertNotNull;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

/**
 * Author: Munyaradzi  Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreControllerTest
 */
 /*
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class) /*/
public class EmployeeStoreControllerTest {
@Autowired
     /* private String baseURL="http://localhost:8080/employeestore";
     private TestRestTemplate restTemplate;
    private EmployeeStore employeeStore = EmployeeStoreFactory.createEmployeeStore("bebe","A100");
 */
    @Test
    public void a_create() {

        /* String url = baseURL + "create";
        System.out.println("URL: " + url);
        System.out.println("Post Info: " + employeeStore);

        System.out.println("ID: "+ employeeStore.getEmpID());

       ResponseEntity<EmployeeStore> employeeStoreResponseEntity
                = restTemplate.postForEntity(url, employeeStore, EmployeeStore.class);
        assertNotNull(employeeStoreResponseEntity);

        assertNotNull(employeeStoreResponseEntity.getBody());
        employeeStore = employeeStoreResponseEntity.getBody();
        System.out.println("Saved data: " + employeeStore);
        assertEquals(employeeStore.getEmpID(), employeeStoreResponseEntity.getBody().getEmpID());
*/
    }




    @Test
    public void d_read() {
        /* String url = baseURL + "read" + employeeStore.getEmpID();
        System.out.println("EmployeeStore Read URL:  " + url);
        ResponseEntity<EmployeeStore> employeeStoreResponseEntity = restTemplate.getForEntity(url, EmployeeStore.class);
        assertNotNull(employeeStoreResponseEntity);
        assertNotNull(employeeStoreResponseEntity.getBody()); */
    }

    @Test
    public void b_update() {
        /* EmployeeStore updatedRecord = new EmployeeStore.Builder().copy(employeeStore).setStoreID("3").build();
        String url = baseURL + "update";
        System.out.println("URL:  " + url);
        System.out.println("Updated Store Type: " + employeeStore.getEmpID());
        ResponseEntity<EmployeeStore> ResponseEntity = restTemplate.postForEntity(url,updatedRecord, EmployeeStore.class);
        assertNotNull(ResponseEntity);
        assertNotNull(updatedRecord);
        System.out.println("New Store Record: " + employeeStore.getEmpID() ); */
    }

    @Test
    public void c_getAll() {
        /* String url = baseURL + "viewAll" ;
        System.out.println("View all URL:  " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity); */
    }

    @Test
    public void e_delete() {
      /* String url = baseURL + "delete" + employeeStore.getEmpID();
        System.out.println("URL:  " + url);
        restTemplate.delete(url);*/
    }
}