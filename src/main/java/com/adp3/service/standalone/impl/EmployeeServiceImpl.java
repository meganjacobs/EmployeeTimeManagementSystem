package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Employee;
import com.adp3.repository.standalone.EmployeeRepository;
import com.adp3.service.standalone.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Service implementation
 * 2020
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository emp_repo ;

    @Override
    public Set<Employee> getAll() {

        return this.emp_repo.findAll().stream().collect(Collectors.toSet());

    }

    @Override
    public Employee create(Employee emp) {

        return this.emp_repo.save( emp );

    }

    @Override
    public Employee read(String str) {

        return this.emp_repo.findById( str ).orElse( null );

    }

    @Override
    public Employee update(Employee emp) {

        if( this.emp_repo.existsById(emp.getEmpID())){
            return this.emp_repo.save(emp);}
        return null;
        //return this.emp_repo.save( emp);

    }

    @Override
    public void delete(String str) {

        this.emp_repo.deleteById( str );

    }
}
