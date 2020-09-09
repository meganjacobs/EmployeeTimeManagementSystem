package com.adp3.service.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.service.IService;
import java.util.Set;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Service Interface
 * 2020
 */

public interface EmployeeService extends IService<Employee, String> {

    Set<Employee> getAll();

}
