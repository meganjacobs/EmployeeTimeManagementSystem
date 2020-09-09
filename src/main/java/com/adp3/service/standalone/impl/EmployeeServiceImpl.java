package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Employee;
import com.adp3.factory.standalone.EmployeeFactory;
import com.adp3.repository.standalone.EmployeeRepository;
import com.adp3.repository.standalone.impl.EmployeeRepositoryImpl;
import com.adp3.service.standalone.EmployeeService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Service implementation
 * 2020
 */

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeService emp_service = null;
    private EmployeeRepository emp_repo ;

    private EmployeeServiceImpl(){

        this.emp_repo = EmployeeRepositoryImpl.getRepository();

    }


    public static EmployeeService getEmpService() {

        if (emp_service == null) {
            emp_service = new EmployeeServiceImpl();
        }

        return  emp_service;
    }


    @Override
    public Set<Employee> getAll() {

        return this.emp_repo.getAll();

    }

    @Override
    public Employee create(Employee employee) {

        return this.emp_repo.create( employee );

    }

    @Override
    public Employee read(String s) {

        return this.emp_repo.read( s );

    }

    @Override
    public Employee update(Employee t) {

        return this.emp_repo.update( t );

    }

    @Override
    public boolean delete(String s) {

        return this.emp_repo.delete( s );

    }
}
