package com.adp3.factory;

import com.adp3.entity.EmployeeSalary;
import com.adp3.entity.EmployeeStore;
import com.adp3.util.GenericHelper;
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
