

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactoryTest
 * */

package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.TimekeepingService;
import com.adp3.factory.standalone.TimekeepingServiceFactory;
import junit.framework.TestCase;
import org.junit.Assert;

public class TimekeepingServiceRepositoryimpTest extends TestCase {
   private TimekeepingServiceRepositoryimp repository = new TimekeepingServiceRepositoryimp();
    TimekeepingService timekeepingservice = TimekeepingServiceFactory.buildTimekeepingService(1000,1500,"LM88");



    public void testGetRepository() {
    }

    public void testCreate() {
        TimekeepingService cExpected = repository.create(timekeepingservice);
        Assert.assertEquals(cExpected.getempID(),timekeepingservice.getempID());


    }

    public void testRead() {

        TimekeepingService rTimekeepingservice  = repository.read(timekeepingservice.getempID());
    Assert.assertNotNull(rTimekeepingservice);
    }

    public void testUpdate() {
        TimekeepingService rTimekeepingservice = new TimekeepingService.Builder()
                .setEmployee_id("LM878")
                .setTime_In(1500)
                .setTime_Out(2100)
                .copy(timekeepingservice)
                .build();

        Assert.assertEquals(rTimekeepingservice.getempID(),"LM878");
    }

    public void testDelete() {
repository.delete(timekeepingservice.getempID());
Assert.assertNull(timekeepingservice.getempID());
    }

    public void testGetAll() {

        Assert.assertNull(repository.getAll());
    }
}