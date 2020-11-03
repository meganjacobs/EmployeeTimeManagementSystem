package com.adp3.repository.standalone;

import com.adp3.entity.standalone.Employee;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee Repository
 * 2020
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {


}
