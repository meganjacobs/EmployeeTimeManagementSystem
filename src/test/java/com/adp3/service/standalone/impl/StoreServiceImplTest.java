package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import java.util.Set;
import static org.junit.Assert.*;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreServiceTest - this class tests the methods in StoreServiceImpl"
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest
@RunWith(SpringRunner.class)
public class StoreServiceImplTest {

    @Autowired
    StoreServiceImpl service;
    Store store;

    @Before
    public void setup(){
        store = StoreFactory.createStore("Cape Town");
        service.create(store);
    }

    @Test
    public void d_getAll() {
        Set<Store> stores = service.getAll();
        Assert.notNull(stores,"stores populated");
        System.out.println("ALL: " + stores);
    }

    @Test
    public void a_create() {
        service.create(store);
        assertEquals(store.getStoreID(), store.getStoreID());
        System.out.println("CREATED: " + store);
    }

    @Test
    public void b_read() {
        Store read = service.read(store.getStoreID());
        Assert.hasText(store.getStoreName(),"storeHasName");
        System.out.println("READ: " + read);
    }

    @Test
    public void c_update() {
        if (service.read(store.getStoreID())!=null){
            service.update(store);
            System.out.println("Record Exists:  " + store.getStoreID());
            System.out.println("Updated : " + store);
        }
        else System.out.println("Store does not exist: ");
        Assert.notNull(store);
    }

    @Test
    public void e_delete() {
        service.delete(store.getStoreID());
        System.out.println("DELETED: "+service.getAll());
    }
}