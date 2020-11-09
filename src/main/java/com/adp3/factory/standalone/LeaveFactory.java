package com.adp3.factory.standalone;

import com.adp3.entity.standalone.Leave;
import com.adp3.util.GenericHelper;

//https://github.com/anongxa/EmployeeTimeManagementSystem.git

public class LeaveFactory {

    private LeaveFactory(){
    }

    public static Leave createLeave(String leaveDescription) {
        String leaveID = GenericHelper.generateID();
        return new Leave.Builder()
                .setLeaveID(leaveID)
                .setLeaveDescription(leaveDescription)
                .build();
    }

}