package com.adp3.service.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.repository.bridge.EmployeeRoleRepository;
import com.adp3.repository.bridge.impl.EmployeeRoleRepositoryImpl;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
public class EmployeeRoleServiceImpl implements EmployeeRoleService {

    private static EmployeeRoleService employeeRoleService = null;
    private EmployeeRoleRepository employeeRoleRepository;

    private EmployeeRoleServiceImpl(){
        this.employeeRoleRepository = EmployeeRoleRepositoryImpl.getRepository();

    }

    public static EmployeeRoleService getEmployeeRoleService(){
        if (employeeRoleService == null) employeeRoleService = new EmployeeRoleServiceImpl();
        return employeeRoleService;
    }


    @Override
    public EmployeeRole create(EmployeeRole employeeRole) {
        this.employeeRoleRepository.create(employeeRole);
        return employeeRole;
    }

    @Override
    public EmployeeRole read(String s) {
        this.employeeRoleRepository.read(s);
        return null;

    }

    @Override
    public EmployeeRole update(EmployeeRole employeeRole) {
        this.employeeRoleRepository.update(employeeRole);
        return employeeRole;
    }

    @Override
    public void delete(String s) {
        this.employeeRoleRepository.delete(s);
        return;

    }

    @Override
    public Set<EmployeeRole> getAll() {
        this.employeeRoleRepository.getAll();
        return null;
    }

    @Override
    public Set<EmployeeRole> getAllEmployeeRolesStartWith() {
        Set<EmployeeRole> employeeRoles= getAll();
        Set<EmployeeRole> employeeRoleStartWithA = new HashSet<>();
        for (EmployeeRole employeeRole :employeeRoles) {
            for (employeeRole.getRoleID().trim().toLowerCase().startsWith("a")) {
                employeeRoleStartWithA.add(employeeRole);
            }

        }
        return employeeRoleStartWithA;
    }
}
