package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.repository.standalone.StoreRepository;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreRepositoryImpl class
 */

public class StoreRepositoryImpl implements StoreRepository {

    private Set<Store> storeDB;
    private static StoreRepository repository = null;
    public StoreRepositoryImpl() {this.storeDB = new HashSet<>();}

    public static StoreRepository getRepository(){

        if (repository == null) repository = new StoreRepositoryImpl();
        return repository;

    }

    /*method used to create a new Store
     * @param: storeName, storeId - eg. store name, store ID
     * @return: Store
     * */
    @Override
    public Store create(Store store) {
        this.storeDB.add(store);
        return store;
    }
    /*method used to read a new Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public Store read(String storeID) {
        Store store = null;

        for (Store s : this.storeDB) {
            if (s.getStoreID().equalsIgnoreCase(storeID)) {
                store = s;
                break;
            }
        }
        return store;
    }

    /*method used to update a new Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public Store update(Store store) {
        Store oldStore = read(store.getStoreID());
        if (oldStore != null) {
            this.storeDB.remove(oldStore);
            this.storeDB.add(store);
        }
        return store;
    }

    /*method used to delete a Store
     * @param: storeName, storeId - eg. store name "Cape Town", store ID "01"
     * @return: Store
     * */
    @Override
    public void delete (String storeID){
        Store store = read(storeID);
        if(store != null) this.storeDB.remove(store);

    }

    @Override
    public Set<Store> getAll() {return this.storeDB;}
}
