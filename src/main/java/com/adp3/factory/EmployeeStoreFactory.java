package com.adp3.factory;

import com.adp3.entity.EmployeeStore;
import com.adp3.util.GenericHelper;

public class EmployeeStoreFactory {

    public static EmployeeStore getEmployeeStore(String storeID, String empID){
        String EmployeeStore = GenericHelper.generateID();
        EmployeeStore employeeStore = new EmployeeStore.Builder()
                .setStoreID(storeID)
                .setEmpID(empID)
                .build();

        return employeeStore;
    }
}
