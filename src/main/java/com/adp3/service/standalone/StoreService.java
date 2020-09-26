package com.adp3.service.standalone;

import com.adp3.entity.standalone.Store;
import com.adp3.service.IService;
import java.util.Set;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreService - extends member methods of parent "IService"
 */


public interface StoreService extends IService<Store, String>{
    Set<Store> getAll();
    //Unique business logic as per Store
    Set<Store> getAllStartingWithA();
    }
