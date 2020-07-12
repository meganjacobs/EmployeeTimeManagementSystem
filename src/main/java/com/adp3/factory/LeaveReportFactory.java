package com.adp3.factory;

import com.adp3.entity.LeaveReport;
import com.adp3.util.GenericHelper;

public class LeaveReportFactory {

    public static LeaveReport getLeaveReport (String leaveReportID,String leaveID,String leaveReportDesc) {
        return new LeaveReport.Builder()
                    .setLeaveReportID(leaveReportID)
                    .setLeaveID(leaveID)
                    .setLeaveReportDesc(leaveReportDesc)
                    .build();
    }
}
