package com.adp3.entity.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Liesl Gounden-Wentzel
 * desc: EmployeeSalary class created using Builder Pattern
 */

 @Entity
public class EmployeeSalary {

     @Id
     private String empSalId;
    private String date;
    private String empID;
    private double empRate;
    private double empHours;
   private double empSalary;

    protected EmployeeSalary(){}

    private EmployeeSalary(Builder builder) {
        this.empSalId = builder.empSalId;
        this.date = builder.date;
        this.empID = builder.empID;
        this.empRate = builder.empRate;
        this.empHours = builder.empHours;
        this.empSalary = builder.empSalary;
    }

    public String getEmpSalId(){return empSalId;}

    public String getDate(){return date;}

    public String getEmpID() {
        return empID;
    }

    public double getEmpRate() {
        return empRate;
    }

    public double getEmpHours() { return empHours; }

    /*public double getEmpSalary() {
        empSalary = getEmpHours() * getEmpSalaryRate();
        return empSalary;
    }*/

    @Override
    public String toString() {
        return "EmployeeSalary{" +
                "EmpSalId= '" + empSalId +'\''+
                "date= '" + date +'\''+
                "empID='" + empID + '\'' +
                ", empSalaryRate=" + empRate +
                ", empHours=" + empHours +
                ", empSalary=" + empSalary +
                '}';
    }


    public static class Builder{
        private String empSalId;
        private String date;
        private String empID;
        private double empRate;
        private double empHours;
        private double empSalary;

        public Builder setEmpSalId(String empSalId) {
            this.empSalId = empSalId;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setEmpRate(double empRate) {
            this.empRate= empRate;
            return this;
        }

        public Builder setEmpHours(double empHours) {
            this.empHours= empHours;
            return this;
        }




        public Builder copy(EmployeeSalary employeeSalary) {
            this.empSalId = employeeSalary.empSalId;
            this.date = employeeSalary.date;
            this.empID = employeeSalary.empID;
            this.empRate = employeeSalary.empRate;
            this.empHours = employeeSalary.empHours;
            this.empSalary = employeeSalary.empSalary;

            return this;
        }

        public EmployeeSalary build() {
            return new EmployeeSalary(this);
        }


    }
}
