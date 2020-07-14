package com.adp3.factory;

import com.adp3.entity.Employee;
import com.adp3.entity.Leave;
import com.adp3.entity.LeaveReport;
import com.adp3.util.GenericHelper;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Factory: LeaveReportFactory
 */

public class LeaveReportFactory {
    private static LeaveReport leaveReport = null;

    private LeaveReportFactory(){
    }

    /*method used to create a new LeaveReport
    * @param: leaveID - eg. record 001, record 231 etc & leaveReportDesc - eg. Annual Leave, Sick Leave etc
    * @return:
    * */
    public static LeaveReport createLeaveReport(String leaveID,String leaveReportDesc) {
        String leaveReportID = GenericHelper.generateID();
        return new LeaveReport.Builder()
                .setLeaveReportID(leaveReportID)
                .setLeaveID(leaveID)
                .setLeaveReportDesc(leaveReportDesc)
                .build();
    }

}
