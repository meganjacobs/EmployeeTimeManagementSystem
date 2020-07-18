package com.adp3.factory;


import com.adp3.entity.bridging.EmployeeStore;
import com.adp3.factory.bridging.EmployeeStoreFactory;
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
    EmployeeStore employeeStore = EmployeeStoreFactory.getEmployeeStore("A16","1");


    @Test
    public void employeeStoreNotNull() {
        // Test empID and ad storeID is not null;

        Assert.assertNotNull(employeeStore.getEmpID());
        Assert.assertNotNull(employeeStore.getStoreID());

    }
    @Test
    // Testing Object Identity and Equality for storeID
    public void getStoreID() {


            assertSame("A16",employeeStore.getStoreID());
            assertEquals("A16",employeeStore.getStoreID());

        }

        @Test
        // Testing Object Identity and Equality for EmpID
        public void getEmpID() {

            assertSame("1",employeeStore.getEmpID());
            assertEquals("1",employeeStore.getEmpID());

    }
}