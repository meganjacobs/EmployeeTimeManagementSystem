
/**
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimeKeepingService
 */
package com.adp3.factory.standalone;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.util.GenericHelper;

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactory
 * */


public class TimekeepingFactory {

    public static Timekeeping buildTimekeepingService(int time_In, int time_Out, String empID) {
        String recID = GenericHelper.generateID();
      return new Timekeeping.Builder()
              .setRecID(recID)
              .setTime_In(time_In)
              .setTime_Out(time_Out)
              .setEmployee_id(empID)
              .build();
    }
}
