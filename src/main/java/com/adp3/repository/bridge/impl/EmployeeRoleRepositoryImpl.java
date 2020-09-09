package com.adp3.repository.bridge.impl;


import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.repository.bridge.EmployeeRoleRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
public class EmployeeRoleRepositoryImpl implements EmployeeRoleRepository {

    private Set<EmployeeRole> employeeRoleDB;
    private static EmployeeRoleRepository employeeRoleRepository =null;

    public EmployeeRoleRepositoryImpl(){
        this.employeeRoleDB = new HashSet<>();
    }

    public static EmployeeRoleRepository getRepository() {
        if (employeeRoleRepository == null) employeeRoleRepository = new EmployeeRoleRepositoryImpl();
        return employeeRoleRepository;


    }

    @Override
    public Set<EmployeeRole> getAll() {
        return this.employeeRoleDB;
    }

    @Override
    public EmployeeRole create(EmployeeRole employeeRole) {
        this.employeeRoleDB.add(employeeRole);
        return employeeRole;
    }

    @Override
    public EmployeeRole read(String empRole) {
        for (EmployeeRole ep : this.employeeRoleDB) {
            if (ep.getRoleID().equalsIgnoreCase(empRole))

                return ep;
        }
        return null;
    }

    @Override
    public EmployeeRole update(EmployeeRole employeeRole) {
        EmployeeRole empRole = read(employeeRole.getEmpID());
        if (empRole != null)
        this.employeeRoleDB.remove(employeeRole);
        this.employeeRoleDB.add(employeeRole);
        return employeeRole;
    }

    @Override

    public void delete(String empRole) {
        EmployeeRole employeeRole = read(empRole);
        if (employeeRole !=null)
            this.employeeRoleDB.remove(employeeRole);
    }
}
