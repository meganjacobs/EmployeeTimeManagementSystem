package com.adp3.entity.reports;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Class Description: LeaveReport
 */
@Entity
public class LeaveReport implements Serializable {
    @Id
    private String leaveReportID;
    private String leaveReportDesc;

    protected LeaveReport(){}

    private LeaveReport(Builder builder) {
        this.leaveReportID = builder.leaveReportID;
        this.leaveReportDesc = builder.leaveReportDesc;
    }

    public String getLeaveReportID() {
        return leaveReportID;
    }

    public String getLeaveReportDesc() {
        return leaveReportDesc;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "leaveReportID='" + leaveReportID + '\'' +
                   ", leaveReportDesc='" + leaveReportDesc + '\'' +
                '}';
    }

    public static class Builder{
        private String leaveReportID;
        private String leaveReportDesc;

        public Builder setLeaveReportID(String leaveReportID) {
            this.leaveReportID = leaveReportID;
            return this;
        }

        public Builder setLeaveReportDesc(String leaveReportDesc) {
            this.leaveReportDesc = leaveReportDesc;
            return this;
        }

        public Builder copy(LeaveReport leaveReport) {
            this.leaveReportID = leaveReport.leaveReportID;
            this.leaveReportDesc = leaveReport.leaveReportDesc;

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
