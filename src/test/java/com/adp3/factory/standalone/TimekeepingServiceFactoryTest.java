package com.adp3.factory.standalone;

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactoryTest
* */
import com.adp3.entity.standalone.TimekeepingService;
import com.adp3.factory.standalone.TimekeepingServiceFactory;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;


public class TimekeepingServiceFactoryTest {
    TimekeepingService timekeepingService;

    @BeforeEach//setting-Up an object
    public void setUp() {
    this.timekeepingService = new TimekeepingService.Builder().build();
    timekeepingService = TimekeepingServiceFactory.
            buildTimekeepingService(2000,1400,"1399");
    }

    @Test
    public void buildTimekeepingService() {
        Assert.assertNotNull(timekeepingService);
    } @Test//Testing the TimeIn if it is not null
    public void TimeIN() {
        Assert.assertNotNull(timekeepingService.getTime_In());
    }
    @Test//Testing the TimeOut if it is not null
    public void TimeOUT() {
        Assert.assertNotNull(timekeepingService.getTime_Out());
    }
    @Test//Testing the EmpID if it is not null
    public void buildEmpID() {
        Assert.assertNotNull(timekeepingService.getempID());
    }

}
