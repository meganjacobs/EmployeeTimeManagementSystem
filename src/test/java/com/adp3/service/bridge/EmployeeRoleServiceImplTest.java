package com.adp3.service.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.util.GenericHelper;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class EmployeeRoleServiceImplTest {

    private  static EmployeeRoleService employeeRoleService = EmployeeRoleServiceImpl.getEmployeeRoleService();
    private static String empId = GenericHelper.generateID();
    private  static EmployeeRole employeeRole = EmployeeRoleFactory.createEmployeeRole(empId,"Managerr");



    @Test
    void a_create() {
        EmployeeRole created = employeeRoleService.create(employeeRole);
        assertEquals(employeeRole, created);
        System.out.println(created);

    }

    @Test
    void b_read() {
        EmployeeRole read = employeeRoleService.read(employeeRole.getEmpID());
        System.out.println(employeeRole);
    }

    @Test
    void c_update() {
        EmployeeRole updated = new EmployeeRole.Builder().copy(employeeRole).setEmployeeId(empId).setRoleId("Manager").build();
        updated = employeeRoleService.update(updated);
        System.out.println(updated);

    }

    @Test
    void d_getAll() {
        System.out.println(employeeRoleService.getAll());
    }


    @Test
    void e_delete() {
        employeeRoleService.delete(employeeRole.getEmpID());
    }

    @Test
    void getAllRolesStartWith() {
    }
}
