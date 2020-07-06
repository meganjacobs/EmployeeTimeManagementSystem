package com.adp3.entity;

/**
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimeKeepingService
 */

public class TimekeepingService {
    //time_in
    //time_out
    //empl_id
    private int time_In;
    private int time_Out;
    private int employee_id;

    private TimekeepingService(Builder builder){
        this.time_In = builder.time_In;
        this.time_Out = builder.time_Out;
        this.employee_id = builder.employee_id;
    }

    public int getTime_In() {
        return time_In;
    }

    public int getTime_Out() {
        return time_Out;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    @Override
    public String toString() {
        return "TimekeepingService{" +
                "time_In=" + time_In +
                ", time_Out=" + time_Out +
                ", employee_id=" + employee_id +
                '}';
    }
    public static class Builder{
            private int time_In;
            private int time_Out;
            private int employee_id;

        public Builder(int time_In, int time_Out, int employee_id) {
            this.time_In = time_In;
            this.time_Out = time_Out;
            this.employee_id = employee_id;
        }

        public Builder setTime_In(int time_In) {
            this.time_In = time_In;
            return this;
        }

        public Builder setTime_Out(int time_Out) {
            this.time_Out = time_Out;
            return this;
        }

        public Builder setEmployee_id(int employee_id) {
            this.employee_id = employee_id;
            return this;
        }

        public Builder copy(TimekeepingService timekeepingService){

            this.employee_id = timekeepingService.employee_id;
            this.time_Out= timekeepingService.time_Out;
            this.time_In= timekeepingService.time_In;
        return this;


        }

        public TimekeepingService build(){

            return new TimekeepingService(this);
        }


    }
}
