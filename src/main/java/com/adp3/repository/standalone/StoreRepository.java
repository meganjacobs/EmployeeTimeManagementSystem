package com.adp3.repository.standalone;

import com.adp3.entity.standalone.Store;
import com.adp3.repository.IRepository;
import java.util.Set;

/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Description: StoreRepository - extends member methods of parent "IRepository"
 */

public interface StoreRepository extends IRepository<Store,String> {
    Set<Store> getAll();
}
