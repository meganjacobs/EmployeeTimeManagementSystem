package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.repository.IRepository;

import java.util.Set;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreRepository
 */

public  interface EmployeeStoreRepository extends IRepository<EmployeeStore, String> {
    Set<EmployeeStore> getAll();


}
