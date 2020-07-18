package com.adp3.entity.bridge;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStore
 */

public class EmployeeStore {
    private String empID, storeID;

    private EmployeeStore(Builder builder) {
        this.empID = builder.empID;
        this.storeID = builder.storeID;

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
                ", storeID='" + storeID + '\'' +
                '}';
    }

    public static class Builder {

        private String empID, storeID;

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

}
