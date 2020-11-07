package com.adp3.entity.bridge;

import java.io.Serializable;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
public class EmployeeRoleId implements Serializable {
    private String empID,roleID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeRoleId that = (EmployeeRoleId) o;

        return  (!empID.equals(that.empID)) &&
        roleID.equals(that.roleID);
    }

    @Override
    public int hashCode() {
        int result = empID.hashCode();
        result = 31 * result + roleID.hashCode();
        return result;
    }
}
