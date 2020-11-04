package com.adp3.repository.standalone;

import com.adp3.entity.standalone.Leave;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.core.CrudMethods;

import java.util.Set;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number: 204513723

 */
public interface LeaveRepository extends JpaRepository<Leave, String> {

}

