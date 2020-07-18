package com.adp3.entity.bridging;

/**
 * @author Liesl Gounden-Wentzel
 * desc: EmployessSalary class created using Builder Pattern
 */

public class EmployeeSalary {

    private String empID;
    private double empSalaryRate;

    private EmployeeSalary(Builder builder) {
        this.empID = builder.empID;
        this.empSalaryRate = builder.empSalaryRate;
    }



    public String getEmpID() {
        return empID;
    }

    public double getEmpSalary() {
        return empSalaryRate;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "empID='" + empID + '\'' +
                ", empSalaryRate=" + empSalaryRate +
                '}';
    }


    public static class Builder{
        private String empID;
        private double empSalaryRate;

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setEmpSalaryRate(double empSalaryRate) {
            this.empSalaryRate= empSalaryRate;
            return this;
        }


        public Builder copy(EmployeeSalary employeeSalary) {
            this.empID = employeeSalary.empID;
            this.empSalaryRate = employeeSalary.empSalaryRate;

            return this;
        }

        public EmployeeSalary build() {
            return new EmployeeSalary(this);
        }


    }
}
