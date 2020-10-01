package com.adp3.factory.standalone;

import com.adp3.entity.standalone.Store;
import com.adp3.util.GenericHelper;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Factory: Store
 */

public class StoreFactory {

        public static Store createStore(String storeName) {
            String storeID = GenericHelper.generateID();
              return new Store.Builder()
                    .setStoreID(storeID)
                    .setStoreName(storeName)
                    .build();
        }


}

