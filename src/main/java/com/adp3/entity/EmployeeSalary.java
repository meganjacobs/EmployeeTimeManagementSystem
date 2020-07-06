package com.adp3.entity;

/**
 * @author Liesl Gounden-Wentzel
 * desc: EmployessSalary class created using Builder Pattern
 */

public class EmployeeSalary {

    private String empID;
    private double empSalary;

    private EmployeeSalary(Builder builder) {
        this.empID = builder.empID;
        this.empSalary = builder.empSalary;
    }



    public String getEmpID() {
        return empID;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "empID='" + empID + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }


    public static class Builder{
        private String empID;
        private double empSalary;

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setEmpSalary(double empSalary) {
            this.empSalary= empSalary;
            return this;
        }


        public Builder copy(EmployeeSalary employeeSalary) {
            this.empID = employeeSalary.empID;
            this.empSalary = employeeSalary.empSalary;

            return this;
        }

        public EmployeeSalary build() {
            return new EmployeeSalary(this);
        }


    }
}
