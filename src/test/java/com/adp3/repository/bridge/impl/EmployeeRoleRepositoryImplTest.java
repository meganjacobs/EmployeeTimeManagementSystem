/*
package com.adp3.repository.bridge.impl;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.repository.bridge.EmployeeRoleRepository;
import com.adp3.repository.bridge.impl.EmployeeRoleRepositoryImpl;
import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import static junit.framework.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

*/
/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 *//*



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRoleRepositoryImplTest {

    private static EmployeeRoleRepository employeeRoleRepository = new EmployeeRoleRepositoryImpl();
    private static String empId = GenericHelper.generateID();
    private EmployeeRole employeeRole = EmployeeRoleFactory.createEmployeeRole(empId,"Manageer");


    @Test
    void a_create() {
        EmployeeRole created = employeeRoleRepository.create(employeeRole);
        assertEquals(employeeRole, created);
        System.out.println(created);

    }

    @Test
    void b_read() {
        EmployeeRole read = employeeRoleRepository.read(employeeRole.getEmpID());
        System.out.println(employeeRole);
    }

    @Test
    void c_update() {
        EmployeeRole updated = new EmployeeRole.Builder().copy(employeeRole).setEmployeeId(empId).setRoleId("Manager").build();
        updated = employeeRoleRepository.update(updated);
        System.out.println(updated);

    }

    @Test
    void d_getAll() {
        System.out.println(employeeRoleRepository.getAll());
    }


    @Test
    void e_delete() {
        employeeRoleRepository.delete(employeeRole.getEmpID());
    }
}
*/
