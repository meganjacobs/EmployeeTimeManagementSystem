package com.adp3.entity.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStore
 */
@Entity
@IdClass(EmployeeStoreID.class)
public class EmployeeStore {

    @Id
    private String empID, storeID;

    public EmployeeStore(Builder builder) {
        this.empID = builder.empID;
        this.storeID = builder.storeID;
    }

    protected EmployeeStore() {
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

}
