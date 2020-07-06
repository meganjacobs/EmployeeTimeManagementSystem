package com.adp3.entity;

public class Leave {

    private int leave_ID;
    private int leave_Tittle;
    private int days;

    private Leave(Builder builder) {
        this.leave_ID = builder.leave_ID;
        this.leave_Tittle = builder.leave_Tittle;
        this.days = builder.days;
    }

    public int getLeave_ID() {
        return leave_ID;
    }

    public int getLeave_Tittle() {
        return leave_Tittle;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "leave_ID=" + leave_ID +
                ", leave_Tittle=" + leave_Tittle +
                ", days=" + days +
                '}';
    }

    public static class Builder {
        private int leave_ID;
        private int leave_Tittle;
        private int days;


        public Builder(int leave_ID, int leave_Tittle, int days) {
            this.leave_ID = leave_ID;
            this.leave_Tittle = leave_Tittle;
            this.days = days;}

            public Builder setLeave_ID ( int leave_ID){
                this.leave_ID = leave_ID;
                return this;

            }

            public Builder setLeave_Tittle ( int leave_Tittle){
                this.leave_Tittle = leave_Tittle;
                return this;
            }

            public Builder setDays ( int days){
                this.days = days;
                return this;
            }

            public Builder copy (Leave leave)
            {
        this.leave_ID =leave.leave_ID;
        this.leave_Tittle =leave.leave_Tittle;
        this.days =leave.days;

        return this;
    }

    public Leave build() {
        return new Leave( this);
    }
    }
}