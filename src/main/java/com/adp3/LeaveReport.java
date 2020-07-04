package com.adp3;

/**
 * @author meganjacobs
 * desc: LeaveReport class created using Builder Pattern
 */
public class LeaveReport {

    private String leaveReportID,leaveID,leaveReportDesc;

    private LeaveReport(Builder builder) {
        this.leaveReportID = builder.leaveReportID;
        this.leaveID = builder.leaveID;
        this.leaveReportDesc = builder.leaveReportDesc;
    }

    public String getLeaveReportID() {
        return leaveReportID;
    }

    public String getLeaveID() {
        return leaveID;
    }

    public String getLeaveReportDesc() {
        return leaveReportDesc;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "leaveReportID='" + leaveReportID + '\'' +
                ", leaveID='" + leaveID + '\'' +
                ", leaveReportDesc='" + leaveReportDesc + '\'' +
                '}';
    }

    public static class Builder{
        private String leaveReportID,leaveID,leaveReportDesc;

        public Builder setLeaveReportID(String leaveReportID) {
            this.leaveReportID = leaveReportID;
            return this;
        }

        public Builder setLeaveID(String leaveID) {
            this.leaveID = leaveID;
            return this;
        }

        public Builder setLeaveReportDesc(String leaveReportDesc) {
            this.leaveReportDesc = leaveReportDesc;
            return this;
        }

        public Builder copy(LeaveReport leaveReport) {
            this.leaveReportID = leaveReport.leaveReportID;
            this.leaveID = leaveReport.leaveID;
            this.leaveReportDesc = leaveReport.leaveReportDesc;

            return this;
        }

        public LeaveReport build() {
            return new LeaveReport(this);
        }


    }

}
