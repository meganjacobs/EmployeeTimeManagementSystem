package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
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

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * ControllerTest:
 * StoreControllerTest
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreControllerTest {

    private  Store store = StoreFactory.createStore("PNP");
    private static  String SECURITY_USERNAME = "Riyaad";
    private static  String SECURITY_PASSWORD = "1234";


    @Autowired
    private TestRestTemplate restTemplate;
    private String URL = "http://localhost:8080/store/";


    /* test create StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @Test
    public void a_create() {
        String url = URL + "create";
        System.out.println("Store Create URL:  " + url);
        ResponseEntity<Store> storeResponseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url, store, Store.class);
        assertNotNull(storeResponseEntity);
        assertNotNull(storeResponseEntity.getBody());
        store = storeResponseEntity.getBody();
        assertEquals(store.getStoreID(), storeResponseEntity.getBody().getStoreID());
        System.out.println("Created data: " +store);
    }


    /* test read StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @Test
    public void b_read() {
        String url = URL + "read" + store.getStoreID();
        System.out.println("Store Read URL:  " + url);
        ResponseEntity<Store> storeResponseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .getForEntity(url, Store.class);
        assertNotNull(storeResponseEntity);
        assertNotNull(storeResponseEntity.getBody());
    }


    /* test update StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @Test
    public void c_update() {
        Store updated  = new Store.Builder().copy(store).setStoreName("Clicks").build();
        String url = URL + "update";
        System.out.println("Store Update URL:  " + url);
        System.out.println("Updated Store Name: " + updated);
        ResponseEntity<Store> storeResponseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .postForEntity(url,updated, Store.class);
        assertNotNull(storeResponseEntity);
        assertNotNull(updated);
    }


    /* test delete StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @Test
    public void e_delete() {
        String url = URL + "delete" + store.getStoreID();
        System.out.println("Store Delete URL:  " + url);
        restTemplate.delete(url);
    }


    /* test getAll StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @Test
    public void d_getAll() {
        String url = URL + "getAll" ;
        System.out.println("Get all URL:  " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate
                .withBasicAuth(SECURITY_USERNAME, SECURITY_PASSWORD)
                .exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(responseEntity.getBody());
        assertNotNull(responseEntity);
    }
}