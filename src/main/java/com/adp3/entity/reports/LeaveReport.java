package com.adp3.entity.reports;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Class Description: LeaveReport returns manager view of employeeLeave per Store
 */
@Entity
public class LeaveReport implements Serializable {
    @Id
    private String leaveReportID;
    private String empID, leaveID, storeID;

    protected LeaveReport(){}

    private LeaveReport(Builder builder) {
        this.leaveReportID = builder.leaveReportID;
        this.empID = builder.empID;
        this.leaveID = builder.leaveID;
        this.storeID = builder.storeID;
    }

    public String getLeaveReportID() {
        return leaveReportID;
    }

    public String getEmpID() { return empID; }

    public String getStoreID() { return storeID; }

    public String getLeaveID() { return leaveID; }

    @Override
    public String toString() {
        return "Builder{" +
                "leaveReportID='" + leaveReportID + '\'' +
                   ", employeeID='" + empID + '\'' +
                    ", leaveID='" + leaveID + '\'' +
                        ", storeID='" + storeID + '\'' +
                '}';
    }

    public static class Builder{
        private String leaveReportID;
        private String empID, leaveID, storeID;

        public Builder setLeaveReportID(String leaveReportID) {
            this.leaveReportID = leaveReportID;
            return this;
        }

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public Builder setLeaveID(String leaveID) {
            this.leaveID = leaveID;
            return this;
        }

        public Builder copy(LeaveReport leaveReport) {
            this.leaveReportID = leaveReport.leaveReportID;
            this.empID = leaveReport.empID;
            this.leaveID = leaveReport.leaveID;
            this.storeID = leaveReport.storeID;
            return this;
        }

        public LeaveReport build() {
            return new LeaveReport(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return leaveReportID.equals(builder.leaveReportID);
        }

        @Override
        public int hashCode() {
            return Objects.hash(leaveReportID);
        }
    }

}
