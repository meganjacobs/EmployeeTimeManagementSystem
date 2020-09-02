package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.repository.IRepository;

import java.util.Set;
        /**
        * @author Zubair Van Oudtshoorn
        * desc: Employess Leave Repository
         * Student#: 217203795
        */

public interface EmployeeLeaveRepository extends IRepository<EmployeeLeave,String> {
    //Retrieves collection specific to EmployeeLeaveRepository
    Set<EmployeeLeave> getAll();


}
