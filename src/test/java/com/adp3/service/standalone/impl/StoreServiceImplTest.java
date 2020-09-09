package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
import com.adp3.repository.standalone.StoreRepository;
import com.adp3.repository.standalone.impl.StoreRepositoryImpl;
import com.adp3.service.standalone.StoreService;
import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreServiceTest - this class tests the methods in StoreServiceImpl"
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreServiceImplTest {


    private static StoreService service = StoreServiceImpl.getService();
    private static String storeID = GenericHelper.generateID();
    private static Store store = StoreFactory.createStore("Cape Town",storeID);

    @Test
    public void d_getAll() {
        Set<Store> stores = service.getAll();
        assertEquals(1, stores.size());
        System.out.println("ALL: " + stores);
    }

    @Test
    public void a_create() {
        Store created = service.create(store);
        assertEquals(store.getStoreID(), created.getStoreID());
        System.out.println("CREATED: " + created);
    }

    @Test
    public void b_read() {
        Store read = service.read(store.getStoreID());
        System.out.println("READ: " + read);
    }

    @Test
    public void c_update() {
        Store updated = new Store.Builder()
                .copy(store)
                .setStoreID(storeID)
                .setStoreName("Durban")
                .build();
        updated = service.update(updated);
        System.out.println("UPDATED: " + updated);
    }

    @Test
    public void e_delete() {
        service.delete(store.getStoreID());
        System.out.println("DELETED: "+service.getAll());
    }
}