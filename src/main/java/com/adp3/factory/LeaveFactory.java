package com.adp3.factory;

import com.adp3.entity.Leave;
import com.adp3.util.Helper;


public class LeaveFactory {

    public static Leave BuildLeave(String leaveID; String leaveDesc; StringleaveDaysAmt; ){

        String LeaveID = Helper.generateID();
        Leave leave = new Leave.Builder()
                .setLeaveID(LeaveID)
                .setLeaveDesc(LeaveDesc)
                .setLeaveDaysAmt(DaysAmt)
                .build()

        return null;
    }
}

