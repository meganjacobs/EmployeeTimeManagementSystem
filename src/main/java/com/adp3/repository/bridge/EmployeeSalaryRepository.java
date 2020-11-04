package com.adp3.repository.bridge;


import com.adp3.entity.bridge.EmployeeSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Liesl Gounden-Wentzel
 * Class: Part Time
 * Student number: 202104133
 * Description: EmployeeSalaryRepository
 */

@Repository
public interface EmployeeSalaryRepository extends JpaRepository<EmployeeSalary, String> {
    //Retrieves collection specific to EmployeeSalaryRepository
    //Set<EmployeeSalary> getAll();
}
