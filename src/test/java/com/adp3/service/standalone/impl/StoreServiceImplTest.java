package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
import com.adp3.service.standalone.StoreService;
import com.adp3.util.GenericHelper;
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
    StoreService service;
    //Store store;
    String storeID = GenericHelper.generateID();
    Store store = StoreFactory.createStore("Cape Town");

    @Test
    public void d_getAll() {
        Set<Store> stores = service.getAll();
        assertEquals(1, stores.size());
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
        System.out.println("READ: " + read);
    }

    @Test
    public void c_update() {

/*        Store updated = new Store.Builder()
                .copy(store)
                .setStoreID(storeID)
                .setStoreName("Durban")
                .build();
        updated = service.update(updated);
        System.out.println("UPDATED: " + updated);*/

        if (service.read(store.getStoreID())!=null){
            service.update(store);
            System.out.println("Record Exists:  " + store.getStoreID());
            System.out.println("Updated : " + store);
        }
        else System.out.println("leaveReport does not exist in database:  ");
        Assert.notNull(store);
    }

    @Test
    public void e_delete() {
        service.delete(store.getStoreID());
        System.out.println("DELETED: "+service.getAll());
    }
}