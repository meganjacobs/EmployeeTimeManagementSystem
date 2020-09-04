package com.adp3.repository.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.repository.IRepository;

import java.util.Set;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Repository
 * 2020
 */

public interface EmployeeRepository  extends IRepository<Employee, String>  {

    Set<Employee> getAll();

}
