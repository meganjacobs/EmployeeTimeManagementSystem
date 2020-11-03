package com.adp3.service.standalone.impl;
import com.adp3.entity.standalone.Store;
import com.adp3.repository.standalone.StoreRepository;
import com.adp3.repository.standalone.impl.StoreRepositoryImpl;
import com.adp3.service.standalone.StoreService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreServiceImpl class
 */

 @Service
public class StoreServiceImpl implements StoreService {

    private static StoreService service = null;
    private StoreRepository repository;

    private StoreServiceImpl() {
            this.repository = StoreRepositoryImpl.getRepository();
    }

    public static StoreService getService(){
        if (service == null) service = new StoreServiceImpl();
        return service;
    }

    public static void setService(StoreService service) {
        StoreServiceImpl.service = service;
    }


    @Override
    public Set<Store> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Set<Store> getAllStartingWithA() {
        Set<Store> stores = getAll();
        Set<Store> storesWithA = new HashSet<>();

        for (Store store : stores){
            if (store.getStoreName().trim().toLowerCase().startsWith("a")){
                storesWithA.add(store);
            }
        }
        return storesWithA;
    }
    /*method used to create a new Store
     * @param: storeName, storeId - eg. store name, store ID
     * @return: Store
     * */
    @Override
    public Store create(Store t) {
        return this.repository.create(t);
    }
    /*method used to read a new Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public Store read(String s) {
        return this.repository.read(s);
    }
    /*method used to update a new Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public Store update(Store t) {
        return this.repository.update(t);
    }
    /*method used to delete a Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public boolean delete(String s) {
        this.repository.delete(s);
        return false;
    }
}
