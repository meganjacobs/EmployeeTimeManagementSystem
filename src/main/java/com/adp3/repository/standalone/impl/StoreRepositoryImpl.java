package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
import com.adp3.repository.IRepository;
import com.adp3.repository.standalone.StoreRepositoryInt;


import java.util.HashSet;
import java.util.Set;

public class StoreRepositoryImpl implements StoreRepositoryInt {


    private Set<Store> storeDB;


    public StoreRepositoryImpl() {this.storeDB = new HashSet<>();}
    @Override
    public Store create(Store store) {
        //Store store = StoreFactory.createStore(storeName, storeID);
        this.storeDB.add(store);
        return store;
    }
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

    @Override
    public Store update(Store store) {
        Store oldStore = read(store.getStoreID());
        if (oldStore != null) {
            this.storeDB.remove(oldStore);
            this.storeDB.add(store);

        }

        return store;
    }
    @Override
    public void delete (String storeID){
        Store store = read(storeID);
        if(store != null) this.storeDB.remove(store);

    }


    @Override
    public Set<Store> getAll() {return null;}
}
