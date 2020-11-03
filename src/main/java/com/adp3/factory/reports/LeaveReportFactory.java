package com.adp3.factory.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.util.GenericHelper;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Factory: LeaveReportFactory - generates an object of LeaveReport entity
 */

public class LeaveReportFactory {
    private static LeaveReport leaveReport = null;

    private LeaveReportFactory(){
    }

    /*method used to create a new LeaveReport
    * @param: empID, leaveID, storeID
    * @return: employeeLeave per Store
    * */
    public static LeaveReport buildLeaveReport(String empID,String leaveID,String storeID) {
        String leaveReportID = GenericHelper.generateID();
        return new LeaveReport.Builder()
                .setLeaveReportID(leaveReportID)
                .setEmpID(empID)
                .setLeaveID(leaveID)
                .setStoreID(storeID)
                .build();
    }

}
