package com.adp3.entity;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number:204513723
 * Class Description: Leave
 */

public class Leave {

    private int leaveID;
    private int leaveDesc;
    private int leaveDaysAmt;

    private Leave(Builder builder) {
        this.leaveID = builder.leaveID;
        this.leaveDesc = builder.leaveDesc;
        this.leaveDaysAmt = builder.leaveDaysAmt;
    }
    public int getLeaveID() {
        return leaveID;
    }

    public int getLeaveDesc() {
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
        private int leaveID;
        private int leaveDesc;
        private int leaveDaysAmt;


        public Builder setLeaveID(int leaveID) {
            this.leaveID = leaveID;
            return this;

        }

        public Builder setLeaveDesc(int leaveDesc) {
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