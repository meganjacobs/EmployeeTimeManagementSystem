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

    public EmployeeRoleRepositoryImpl(){
        this.employeeRoleDB = new HashSet<>();
    }



     public EmployeeRole read(String empId) {
        EmployeeRole employeeRole = null;
        for (EmployeeRole e : this.employeeRoleDB){
            if (e.getEmpID().equalsIgnoreCase(empId)){
                employeeRole = e;
                break;
            }
        }
        this.employeeRoleDB.add(employeeRole);
        return null;
    }

    @Override
    public EmployeeRole create(EmployeeRole employeeRole) {
        this.employeeRoleDB.add(employeeRole);
        return employeeRole;
    }


    @Override
    public EmployeeRole update(EmployeeRole employeeRole) {
        EmployeeRole olDemployeeRole = read(employeeRole.getEmpID());
        if (olDemployeeRole != null);
        this.employeeRoleDB.remove(olDemployeeRole);
        this.employeeRoleDB.add(employeeRole);
        return employeeRole;
    }

    @Override
    public void delete(String empId) {
        EmployeeRole employeeRole = read(empId);
        if (employeeRole !=null)this.employeeRoleDB.remove(employeeRole);

    }

    @Override
    public Set<EmployeeRole> getAll() {
        return this.employeeRoleDB;
    }
}
