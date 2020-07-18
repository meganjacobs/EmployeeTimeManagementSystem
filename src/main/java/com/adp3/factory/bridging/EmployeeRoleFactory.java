package com.adp3.factory.bridging;

import com.adp3.entity.bridging.EmployeeRole;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: EmployeeRoleFactory
 */


public class EmployeeRoleFactory {


    public static EmployeeRole getEmployeeRole(String empId, String roleId){
        return new EmployeeRole.Builder()
        .setEmployeeId(empId)
        .setRoleId(roleId)
        .build();

        }
}
