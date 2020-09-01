package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeStore;
/*
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreFactory
 */

public class EmployeeStoreFactory {

    public static EmployeeStore getEmployeeStore(String storeID, String empID){
        //String EmployeeStore = GenericHelper.generateID();

        return new EmployeeStore.Builder()
        .setStoreID(storeID)
        .setEmpID(empID)
        .build();


    }
}
