package com.adp3.service.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.service.IService;

import java.util.Set;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreService
 */

public  interface EmployeeStoreService extends IService<EmployeeStore, String> {
    Set<EmployeeStore> getAll();
    EmployeeStore findByID(String empID, String storeID);
    Set<EmployeeStore>findByEmpID(String empID);

}
