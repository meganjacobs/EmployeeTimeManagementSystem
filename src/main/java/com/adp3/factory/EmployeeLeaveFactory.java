package com.adp3.factory;


import com.adp3.entity.EmployeeLeave;

/**
 * @author Zubair Van Oudtshoorn
 * desc: Employess Leave Factory - Calculate amount of Leave Days taken by a Employee
 */
public class EmployeeLeaveFactory {

    public  static EmployeeLeave calcEmployeeLeave(String empID, String leaveID, String startDate, String endDate){
        return new EmployeeLeave.Builder()
                .setEmpID(empID)
                .setLeaveID(leaveID)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .build();


    }
}
