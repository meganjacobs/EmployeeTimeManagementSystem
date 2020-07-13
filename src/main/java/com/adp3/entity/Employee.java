package com.adp3.entity;

import com.adp3.factory.EmployeeFactory;

import java.util.Date;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee class created using Builder Pattern
 * 2020
 */

public class Employee {

    private String empID, empName, empLastName, empPhoneNumber;
    private Date empDOB;

    public Employee(Builder builder) {
        this.empID = builder.empID;
        this.empName = builder.empName;
        this.empLastName = builder.empLastName;
        this.empPhoneNumber = builder.empPhoneNumber;
        this.empDOB = builder.empDOB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empPhoneNumber='" + empPhoneNumber + '\'' +
                ", empDOB=" + empDOB +
                '}';
    }

    public static class Builder
    {
        private String empID, empName, empLastName, empPhoneNumber;
        private Date empDOB;

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setEmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder setEmpLastName(String empLastName) {
            this.empLastName = empLastName;
            return this;
        }

        public Builder setEmpPhoneNumber(String empPhoneNumber) {
            this.empPhoneNumber = empPhoneNumber;
            return this;
        }

        public Builder setEmpDOB(Date empDOB) {
            this.empDOB = empDOB;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    } // end Builder

}
