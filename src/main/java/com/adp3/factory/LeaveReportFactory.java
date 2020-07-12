package com.adp3.factory;

import com.adp3.entity.LeaveReport;
import com.adp3.util.GenericHelper;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Factory: LeaveReportFactory
 */

public class LeaveReportFactory {

    /* general method for user to retrieve a LeaveReport,
    ** receives 2 values received from user and auto-generates leaveReportID*/
    public static LeaveReport getLeaveReport (String leaveID,String leaveReportDesc) {
        return new LeaveReport.Builder()
                    .setLeaveReportID(GenericHelper.generateID())
                    .setLeaveID(leaveID)
                    .setLeaveReportDesc(leaveReportDesc)
                    .build();
    }
}
