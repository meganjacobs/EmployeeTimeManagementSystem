package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Set;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
@Repository
public interface EmployeeRoleRepository extends JpaRepository<EmployeeRole,String> {
    Set<EmployeeRole> getAll();

}
