package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
        /**
        * @author Zubair Van Oudtshoorn
        * desc: Employess Leave Repository
         * Student#: 217203795
        */
@Repository
public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, String> {
    //Retrieves collection specific to EmployeeLeaveRepository
    //Set<EmployeeLeave> getAll();


}
