package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
import com.adp3.repository.standalone.StoreRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreRepositoryTest - this class tests the methods in StoreRepositoryImpl"
 */

//Annotation of executing tests in alphabetical order
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreRepositoryImplTest {

    private static StoreRepository repository = new StoreRepositoryImpl();
    private Store store = StoreFactory.createStore("Cape Town", "01");

    @Test
    public void a_create() {

        Store created = repository.create(store);
        assertEquals(store.getStoreID(), created.getStoreID());
        System.out.println("Created : " + created);
    }

    @Test
    public void b_read() {
        Store read = repository.read(store.getStoreID());
        System.out.println("Read : " + read);

    }

    @Test
    public void c_update() {
        Store updated = new Store.Builder()
                .copy(store)
                .setStoreID("101")
                .setStoreName("Cape Town")
                .build();
        System.out.println("Updated : " + updated);
    }

    @Test
    public void e_delete() {
        repository.delete(store.getStoreID());
    }

    @Test
    public void d_getAll() {
        System.out.println(repository.getAll());
    }
}