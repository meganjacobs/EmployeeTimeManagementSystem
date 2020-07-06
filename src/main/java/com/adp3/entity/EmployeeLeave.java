package com.adp3.entity;

/**
 * @Zubair Van Oudtshoorn - Part Time - 217203795
 * Creation of EmployeeLeave Class
 *
 * **/

public class EmployeeLeave {

    private int employee_id, leaveID;
    private String startDate, endDate;


    private EmployeeLeave(Builder builder){
        this.employee_id = builder.employee_id;
        this.leaveID = builder.leaveID;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
    }
    public int getEmployee_id() {
        return employee_id;
    }

    public int getLeaveID() {
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
                "Employee ='" + employee_id + '\'' +
                ", Leave Type ='" + leaveID + '\'' +
                ", Start date ='" + startDate + '\'' +
                ", End date ='" + endDate + '\'' +
                '}';
    }

    public static class Builder {
        private int employee_id, leaveID;
        private String startDate, endDate;


        /*  public Builder(int employee_id, int leaveID, String startDate, String endDate) {
              this.employee_id = employee_id;
              this.leaveID = leaveID;
              this.startDate = startDate;
              this.endDate = endDate;
          }
          */


        public EmployeeLeave.Builder setEmployee_id(int employee_id) {
            this.employee_id = employee_id;
            return this;
        }

        public EmployeeLeave.Builder setLeaveID(int leaveID) {
            this.leaveID = leaveID;
            return this;
        }

        public EmployeeLeave.Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public EmployeeLeave.Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }


        public EmployeeLeave.Builder copy(EmployeeLeave employeeLeave) {

            this.employee_id = employeeLeave.employee_id;
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
