package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.repository.standalone.StoreRepository;
import com.adp3.service.standalone.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreServiceImpl class
 */

 @Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository repository;

    @Override
    public Set<Store> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
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
        return this.repository.save(t);
    }
    /*method used to read a new Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public Store read(String s) {return this.repository.findById(s).orElseGet(null);}
    /*method used to update a new Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public Store update(Store t) {

        if( this.repository.existsById(t.getStoreID())){
            return this.repository.save(t);}
        return null;
    }
    /*method used to delete a Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public void delete(String s) {
        if (repository.existsById(s)){
            repository.deleteById(s);
        }
        else System.out.println("Record does not exist");
    }
}
