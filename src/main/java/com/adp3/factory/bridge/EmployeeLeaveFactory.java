package com.adp3.factory.bridge;


import com.adp3.entity.bridge.EmployeeLeave;

import java.util.Date;


/**
 * @author Zubair Van Oudtshoorn
 * desc: Employess Leave Factory - Calculate amount of Leave Days taken by a Employee
 */

public class EmployeeLeaveFactory {

    /*method used to create a new EmployeeLeave
     * @param: EmpID - eg. Emp A16, Emp A1 etc & LeaveID pulled from EmployeeLeaveFactory
     *  - eg. Annual Leave, Sick Leave etc as well as start and end date to be received from user
     * @return: set Values
     * */

    public  static EmployeeLeave calcEmployeeLeave(String empID, String leaveID, Date startDate, Date endDate){
        return new EmployeeLeave.Builder()
                .setEmpID(empID)
                .setLeaveID(leaveID)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .build();

    }
}
