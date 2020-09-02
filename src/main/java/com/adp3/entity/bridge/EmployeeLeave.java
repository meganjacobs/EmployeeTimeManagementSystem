package com.adp3.entity.bridge;

/**
 * Zubair Van Oudtshoorn - Part Time - 217203795
 * Creation of EmployeeLeave Class
 *
 * **/

public class EmployeeLeave {

    private String empID, leaveID;
    private String startDate, endDate;



    public EmployeeLeave(Builder builder){
        this.empID = builder.empID;
        this.leaveID = builder.leaveID;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }
    public String getEmpID() {
        return empID;
    }

    public String getLeaveID() {
        return leaveID;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Employee Leave{" +
                "Employee ='" + empID + '\'' +
                ", Leave Type ='" + leaveID + '\'' +
                ", Start date ='" + startDate + '\'' +
                ", End date ='" + endDate + '\'' +
                '}';
    }

    public static class Builder {
        private String empID, leaveID;
        private String startDate, endDate;

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setLeaveID(String leaveID) {
            this.leaveID = leaveID;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public Builder copy(EmployeeLeave employeeLeave) {

            this.empID = employeeLeave.empID;
            this.leaveID = employeeLeave.leaveID;
            this.startDate = employeeLeave.startDate;
            this.endDate = employeeLeave.endDate;

            return this;


        }

        public EmployeeLeave build() {

            return new EmployeeLeave(this);
        }
    }



}
