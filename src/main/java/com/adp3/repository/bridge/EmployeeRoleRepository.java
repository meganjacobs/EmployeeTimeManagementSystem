package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.repository.IRepository;


import java.util.Set;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
public interface EmployeeRoleRepository extends IRepository<EmployeeRole,String> {
    Set<EmployeeRole> getAll();

}
