package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeRole;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: EmployeeRoleFactory
 */


public class EmployeeRoleFactory {


    public static EmployeeRole createEmployeeRole(String empId, String roleId){
        EmployeeRole employeeRole = new EmployeeRole.Builder()
        .setEmployeeId(empId)
        .setRoleId(roleId)
        .build();
        return employeeRole;

        }
}
