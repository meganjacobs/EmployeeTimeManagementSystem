

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceTest
 * */


package com.adp3.service.standalone.impl;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.factory.standalone.TimekeepingFactory;
import junit.framework.TestCase;
import org.junit.Assert;

public class TimeKeepingServiceImplTest extends TestCase {
    //private TimeKeepingServiceServicesImpl repository = new TimeKeepingServiceServicesImpl();
    Timekeeping timekeepingservice = TimekeepingFactory.buildTimekeepingService(1000,1500,"LM88");



    public void testGetRepository() {
    }

    public void testCreate() {
//        TimekeepingService cExpected = repository.create(timekeepingservice);
//        Assert.assertEquals(cExpected.getempID(),timekeepingservice.getempID());


    }

    public void testRead() {

//        TimekeepingService rTimekeepingservice  = repository.read(timekeepingservice.getempID());
//        Assert.assertNotNull(rTimekeepingservice);
    }

    public void testUpdate() {
        Timekeeping rTimekeepingservice = new Timekeeping.Builder()
                .setEmployee_id("LM88")
                .setTime_In(1500)
                .setTime_Out(2100)
                .copy(timekeepingservice)
                .build();

        Assert.assertEquals(rTimekeepingservice.getempID(),"LM878");
    }

    public void testDelete() {
//        repository.delete(timekeepingservice.getempID());
//        Assert.assertNotNull(timekeepingservice.getempID());
    }

    public void testGetAll() {

        //Assert.assertNotNull(repository.getAll());
    }
}