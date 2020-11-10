package com.adp3.controller.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportFactory;
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


import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreReportsControllerTest {
    StoreReports storeReports = StoreReportFactory.createStoreReports("Work Experience", "123", "23");
    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/storeReports";
    @Test
    public void a_create() {

        String url =baseURL + "create StoreReports";
        System.out.println(url);
        ResponseEntity<StoreReports> storeReportsResponse = restTemplate.withBasicAuth("Steve","stv@123").postForEntity(url,storeReports,StoreReports.class);
        assertNotNull(storeReportsResponse);
        assertNotNull(storeReportsResponse.getBody());
        System.out.println(storeReportsResponse);
        System.out.println("StoreReports :" + storeReports);
    }
    @Test
    public void b_read() {
        String url =baseURL + "read storeReports"+ storeReports.getStoreReportID();
        System.out.println("Store Report URL :"+ url);
        ResponseEntity<StoreReports> storeReportsResponse = restTemplate.withBasicAuth("St", "stv@123").getForEntity(url,StoreReports.class);
        assertNotNull(storeReportsResponse);
        assertNotNull(storeReportsResponse.getBody());
    }
    @Test
    public void c_update() {
        StoreReports storeReportsUpdate =  new StoreReports.Builder().copy(storeReports).build();
        String url =baseURL + "update StoreReports";
        System.out.println("Store Report URL :"+ url);
        System.out.println("Updated Store report: " + storeReportsUpdate);
        ResponseEntity<StoreReports> storeReportsResponse = restTemplate.withBasicAuth("St", "stv@123").postForEntity(url,storeReports,StoreReports.class);
        assertNotNull(storeReportsResponse);
        assertNotNull(storeReportsUpdate);
    }
    @Test
    public void e_delete() {
        String url =baseURL + "delete/" + storeReports.getStoreReportID();
        System.out.println("Store Report URL :"+ url);
        restTemplate.withBasicAuth("St", "stv@123").delete(url);
    }

    @Test
    public void f_getAll() {
        String url = baseURL + "all";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.withBasicAuth("St", "stv@123").exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(response);
        System.out.println(response.getBody());
    }
}