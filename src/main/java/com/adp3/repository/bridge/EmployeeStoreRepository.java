package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreRepository
 */
@Repository
public  interface EmployeeStoreRepository extends JpaRepository<EmployeeStore, String> {



}
