package com.adp3.entity;

/**
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimeKeepingService
 */

public class TimekeepingService {

    private int time_In;
    private int time_Out;
    private String empID;

    private TimekeepingService(Builder builder){
        this.time_In = builder.time_In;
        this.time_Out = builder.time_Out;
        this.empID = builder.empID;
    }

    public int getTime_In() {
        return time_In;
    }

    public int getTime_Out() {
        return time_Out;
    }

    public String getempID() {
        return empID;
    }

    @Override
    public String toString() {
        return "TimekeepingService{" +
                "time_In=" + time_In +
                ", time_Out=" + time_Out +
                ", empID=" + empID +
                '}';
    }
    public static class Builder{
            private int time_In;
            private int time_Out;
            private String empID;

        public Builder(int time_In, int time_Out, String empID) {
            this.time_In = time_In;
            this.time_Out = time_Out;
            this.empID = empID;
        }

        public Builder setTime_In(int time_In) {
            this.time_In = time_In;
            return this;
        }

        public Builder setTime_Out(int time_Out) {
            this.time_Out = time_Out;
            return this;
        }

        public Builder setEmployee_id(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder copy(TimekeepingService timekeepingService){

            this.empID = timekeepingService.empID;
            this.time_Out= timekeepingService.time_Out;
            this.time_In= timekeepingService.time_In;
        return this;


        }

        public TimekeepingService build(){

            return new TimekeepingService(this);
        }


    }
}
