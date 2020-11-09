package com.adp3.entity.standalone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number:204513723
 * Class Description: Leave
 */

@Entity
public class Leave implements Serializable {

    @Id
    private String leaveID;
    private String leaveDescription;
    private int leaveDaysAmt;

    protected Leave(){}

    private Leave(Builder builder) {
        this.leaveID = builder.leaveID;
        this.leaveDescription = builder.leaveDescription;
        this.leaveDaysAmt = builder.leaveDaysAmt;
    }

    public String getLeaveID() {
        return leaveID;
    }

    public String getLeaveDescription() {
        return leaveDescription;
    }

    public int getLeaveDaysAmt() {
        return leaveDaysAmt;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leaveID=" + leaveID +
                ", leaveDesc=" + leaveDescription +
                ", leaveDaysAmt=" + leaveDaysAmt +
                '}';
    }

    public static class Builder {
        public String id;
        public String description;
        private String leaveID;
        private String leaveDescription;
        private int leaveDaysAmt;

        public Builder setLeaveID(String leaveID) {
            this.leaveID = leaveID;
            return this;

        }

        public Builder setLeaveDescription(String leaveDescription) {
            this.leaveDescription = leaveDescription;
            return this;
        }

        public Builder setLeaveDaysAmt(int leaveDaysAmt) {
            this.leaveDaysAmt = leaveDaysAmt;
            return this;
        }

        public Builder copy(Leave leave) {
            this.leaveID = leave.leaveID;
            this.leaveDescription = leave.leaveDescription;
            this.leaveDaysAmt = leave.leaveDaysAmt;
            return this;
        }

        public Leave build() {
            return new Leave(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leave leave = (Leave) o;
        return leaveID.equals(leave.leaveID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaveID);
    }
}