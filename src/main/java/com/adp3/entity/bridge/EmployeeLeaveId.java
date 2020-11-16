package com.adp3.entity.bridge;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class EmployeeLeaveId implements Serializable {
    private String empID;
    private String leaveID;

    public EmployeeLeaveId(){

    }


    public EmployeeLeaveId(String empID, String leaveID){
        this.empID = empID;
        this.leaveID = leaveID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLeaveId that = (EmployeeLeaveId) o;
        return empID.equals(that.empID) &&
                leaveID.equals(that.leaveID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, leaveID);
    }
}
