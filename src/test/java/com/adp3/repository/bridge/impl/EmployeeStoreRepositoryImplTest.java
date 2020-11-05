/*package com.adp3.repository.bridge.impl;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.factory.bridge.EmployeeStoreFactory;
import com.adp3.repository.bridge.EmployeeStoreRepository;
import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;


 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreRepositoryImplTest.


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeStoreRepositoryImplTest {


    private static EmployeeStoreRepository empStoreRepo;
    private static String empID = GenericHelper.generateID();
    private static EmployeeStore employeeStore = EmployeeStoreFactory.createEmployeeStore(empID, "bebe");

    @Test
    public void a_create() {
        EmployeeStore created = empStoreRepo.create(employeeStore);
        assertEquals(employeeStore.getEmpID(), created.getEmpID());
        System.out.println("create: " + created);

    }

    @Test
    public void b_read() {
        EmployeeStore read = empStoreRepo.read(employeeStore.getEmpID());
        System.out.println("Read : " + read);
    }

    @Test
    public void c_update() {
        EmployeeStore updated = new EmployeeStore.Builder().copy(employeeStore).setStoreID("Munya").build();
        updated = empStoreRepo.update(updated);
        System.out.println("Updated : " + updated);
    }

    @Test
    public void d_getAll() {

        System.out.println("GetAll : " + empStoreRepo.getAll());
    }

    @Test
    public void e_delete() {
        empStoreRepo.delete(employeeStore.getEmpID());
        System.out.println("Deleted :" + empStoreRepo.getAll());
    }

}*/