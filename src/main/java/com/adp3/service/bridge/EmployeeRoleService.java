package com.adp3.service.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.service.IService;

import java.util.Set;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
public interface EmployeeRoleService extends IService<EmployeeRole,String> {
    Set<EmployeeRole> getAll();

    Set<EmployeeRole> getAllEmployeeRolesStartWith();


}
