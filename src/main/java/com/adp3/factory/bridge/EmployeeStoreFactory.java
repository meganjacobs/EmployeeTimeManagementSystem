package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeStore;
/*
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreFactory
 */

public class EmployeeStoreFactory {
    private static EmployeeStore employeeStore = null;


    public EmployeeStoreFactory() {

    }

    public static EmployeeStore createEmployeeStore(String empID, String storeID) {
        //String EmployeeStore = GenericHelper.generateID();
        return new EmployeeStore.Builder()
                .setEmpID(empID)
                .setStoreID(storeID)
                .build();


    }
    public static String testClass(){
        return " does it work: ? ";
    }
}
