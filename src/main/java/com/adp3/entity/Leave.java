package com.adp3.entity;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number:204513723
 * Class Description: Leave
 */

public class Leave {

    private String leaveID;
    private String leaveDesc;
    private int leaveDaysAmt;

    private Leave(Builder builder) {
        this.leaveID = builder.leaveID;
        this.leaveDesc = builder.leaveDesc;
        this.leaveDaysAmt = builder.leaveDaysAmt;
    }

    public String getLeaveID() {
        return leaveID;
    }

    public String getLeaveDesc() {
        return leaveDesc;
    }

    public int getLeaveDaysAmt() {
        return leaveDaysAmt;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leaveID=" + leaveID +
                ", leaveDesc=" + leaveDesc +
                ", leaveDaysAmt=" + leaveDaysAmt +
                '}';
    }

    public static class Builder {
        private String leaveID;
        private String leaveDesc;
        private int leaveDaysAmt;

        public Builder setLeaveID(String leaveID) {
            this.leaveID = leaveID;
            return this;

        }

        public Builder setLeaveDesc(String leaveDesc) {
            this.leaveDesc = leaveDesc;
            return this;
        }

        public Builder setLeaveDaysAmt(int leaveDaysAmt) {
            this.leaveDaysAmt = leaveDaysAmt;
            return this;
        }

        public Builder copy(Leave leave) {
            this.leaveID = leave.leaveID;
            this.leaveDesc = leave.leaveDesc;
            this.leaveDaysAmt = leave.leaveDaysAmt;
            return this;
        }

        public Leave build() {
            return new Leave(this);
        }
    }
}