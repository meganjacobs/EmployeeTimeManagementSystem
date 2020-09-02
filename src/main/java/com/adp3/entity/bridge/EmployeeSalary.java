package com.adp3.entity.bridge;

/**
 * @author Liesl Gounden-Wentzel
 * desc: EmployeeSalary class created using Builder Pattern
 */

public class EmployeeSalary {

    private String empID;
    private double empSalaryRate;
    private double empHours;
    private double empSalary;

    private EmployeeSalary(Builder builder) {
        this.empID = builder.empID;
        this.empSalaryRate = builder.empSalaryRate;
        this.empHours = builder.empHours;
        //this.empSalary = builder.empSalary;
    }



    public String getEmpID() {
        return empID;
    }

    public double getEmpSalaryRate() {
        return empSalaryRate;
    }

    public double getEmpHours() { return empHours; }

    public double getEmpSalary() {
        empSalary = getEmpHours() * getEmpSalaryRate();
        return empSalary;
    }

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "empID='" + empID + '\'' +
                ", empSalaryRate=" + empSalaryRate +
                ", empHours=" + empHours +
                ", empSalary=R" + getEmpSalary() +
                '}';
    }


    public static class Builder{
        private String empID;
        private double empSalaryRate;
        private double empHours;


        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setEmpSalaryRate(double empSalaryRate) {
            this.empSalaryRate= empSalaryRate;
            return this;
        }

        public Builder setEmpHours(double empHours) {
            this.empHours= empHours;
            return this;
        }




        public Builder copy(EmployeeSalary employeeSalary) {
            this.empID = employeeSalary.empID;
            this.empSalaryRate = employeeSalary.empSalaryRate;
            this.empHours = employeeSalary.empHours;
            //this.empSalary = employeeSalary.empSalary;

            return this;
        }

        public EmployeeSalary build() {
            return new EmployeeSalary(this);
        }


    }
}
