package com.adp3.entity.standalone;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Malusi Pakade
 * 209105917
 * desc: Employee class created using Builder Pattern
 * 2020
 */

@Entity
public class Employee implements Serializable {

    @Id
    private String empID;
    private String empName, empLastName, empPhoneNumber;
    private Date empDOB;

    protected Employee(){ }

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

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public Date getEmpDOB() {
        return empDOB;
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

        /** this method is used to copy unchanged data during an update to the database */
        public Employee.Builder copy(Employee employee) {
            this.empID = employee.empID;
            this.empName = employee.empName;
            this.empLastName = employee.empLastName;
            this.empPhoneNumber = employee.empPhoneNumber;
            this.empDOB = employee.empDOB;

            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    } // end Builder

}
