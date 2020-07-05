package com.adp3.entity;

/**
 * @Author : Munyaradzi Manyati 215211855
 * EmployeeStore Class
 * Using the Builder Patten
 * 2020.
 */

public class EmployeeStore {
    private String empId, storeId;

    private EmployeeStore(Builder builder) {
        this.empId = builder.empId;
        this.storeId = builder.storeId;

    }

    public String getEmpId() {
        return empId;
    }

    public String getStoreId() {
        return storeId;
    }

    @Override
    public String toString() {
        return "EmployeeStore{" +
                "empId='" + empId + '\'' +
                ", storeId='" + storeId + '\'' +
                '}';
    }

    public static class Builder {

        private String empId, storeId;

        public Builder setEmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }

        public Builder copy(EmployeeStore empStore) {

            this.empId = empStore.empId;
            this.storeId = empStore.storeId;

            return this;
        }

        public EmployeeStore build() {
            return new EmployeeStore(this);
        }
    }

}
