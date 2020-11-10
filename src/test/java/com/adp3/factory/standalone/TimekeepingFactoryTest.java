package com.adp3.factory.standalone;

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactoryTest
* */
import com.adp3.entity.standalone.Timekeeping;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TimekeepingFactoryTest {
    Timekeeping timekeeping;

    @Before//setting-Up an object
    public void setUp() {
    this.timekeeping = new Timekeeping.Builder().build();
    timekeeping = TimekeepingFactory.
            buildTimekeepingService(2000,1400,"1399");
    }

    @Test
    public void buildTimekeepingService() {
        Assert.assertNotNull(timekeeping);
    } @Test//Testing the TimeIn if it is not null
    public void TimeIN() {
        Assert.assertNotNull(timekeeping.getTime_In());
    }
    @Test//Testing the TimeOut if it is not null
    public void TimeOUT() {
        Assert.assertNotNull(timekeeping.getTime_Out());
    }
    @Test//Testing the EmpID if it is not null
    public void buildEmpID() {
        Assert.assertNotNull(timekeeping.getempID());
    }

}
