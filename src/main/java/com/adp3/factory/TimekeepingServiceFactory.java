
/**
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimeKeepingService
 */
package com.adp3.factory;
import com.adp3.entity.*;

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactory
 * */


public class TimekeepingServiceFactory {

    public static TimekeepingService buildTimekeepingService(int time_In,int time_Out,String empID) {

      return new TimekeepingService.Builder()
              .setTime_In(time_In)
              .setTime_Out(time_Out)
              .setEmployee_id(empID)
              .build();
    }
}
