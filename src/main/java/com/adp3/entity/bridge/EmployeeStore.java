package com.adp3.entity.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStore
 */
@Entity
public class EmployeeStore {
    @Id
    private String  empID;
    private String  storeID;

    public EmployeeStore(Builder builder) {
        this.empID = builder.empID;
        this.storeID = builder.storeID;
    }

    private EmployeeStore() {
    }

    public String getEmpID() {
        return empID;
    }
    public String getStoreID() {
        return storeID;
    }
    @Override
    public String toString() {
        return "EmployeeStore{" +
                "empID='" + empID + '\'' +
                "StoreID='" + storeID + "}" + "\n Finished";
    }

    public static class Builder {

        private String empID;
        private String storeID;

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public Builder copy(EmployeeStore empStore) {

            this.empID = empStore.empID;
            this.storeID = empStore.storeID;

            return this;
        }

        public EmployeeStore build() {
            return new EmployeeStore(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeStore that = (EmployeeStore) o;
        return empID.equals(that.empID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID);
    }
}
