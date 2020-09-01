package com.adp3.factory.standalone;

import com.adp3.entity.standalone.Store;

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

