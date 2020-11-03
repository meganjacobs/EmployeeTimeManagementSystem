package com.adp3.entity.user;

import java.io.Serializable;
import java.util.Objects;


public class EmployeeLeaveId implements Serializable {
    private String employeeId;leaveId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLeaveId that = (EmployeeLeaveId) o;
        return Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }
}
