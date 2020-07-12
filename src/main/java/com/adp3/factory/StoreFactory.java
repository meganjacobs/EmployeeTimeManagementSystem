package com.adp3.factory;

import com.adp3.entity.EmployeeSalary;
import com.adp3.entity.Store;
import com.adp3.util.GenericHelper;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Factory: Store
 */

public class StoreFactory {

        public static Store createStore(String storeName, String storeID) {

              return new Store.Builder()
                    .setStoreID(storeID)
                    .setStoreName(storeName)
                    .build();
        }

}

