package com.adp3.entity.bridge;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeStoreId implements Serializable {
    private String empID,storeID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeStoreId that = (EmployeeStoreId) o;
        return empID.equals(that.empID) &&
                storeID.equals(that.storeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, storeID);
    }
}
