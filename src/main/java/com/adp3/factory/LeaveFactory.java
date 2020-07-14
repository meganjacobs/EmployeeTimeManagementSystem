package com.adp3.factory;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number:204513723
 * Class Description: Leave
 */

import com.adp3.entity.Leave;



public class LeaveFactory {

    public static Leave BuildLeave(int leaveID, int leaveDesc, int leaveDaysAmt) {

        return new Leave.Builder()
                .setLeaveDaysAmt(leaveDesc)
                .setLeaveID(leaveID)
                .setLeaveDesc(leaveDesc)
                .build();


    }
}

