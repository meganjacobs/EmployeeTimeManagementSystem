package com.adp3.factory.bridge;


import com.adp3.entity.bridge.EmployeeStore;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Test: EmployeeStoreFactory
 */
public class EmployeeStoreFactoryTest {
    private String empID;
    EmployeeStore employeeStore = EmployeeStoreFactory.createEmployeeStore(empID, "bebe");


    @Test
    public void employeeStoreNotNull() {
        // Test empID and ad storeID is not null;

        Assert.assertNotNull(employeeStore.getEmpID());


    }


        @Test
        // Testing Object Identity and Equality for EmpID
        public void getEmpID() {

            assertSame("1",employeeStore.getEmpID());
            assertEquals("1",employeeStore.getEmpID());

    }
}