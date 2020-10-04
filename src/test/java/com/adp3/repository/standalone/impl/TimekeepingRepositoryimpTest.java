

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactoryTest
 * */

package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Timekeeping;
import com.adp3.factory.standalone.TimekeepingFactory;
import junit.framework.TestCase;
import org.junit.Assert;

public class TimekeepingRepositoryimpTest extends TestCase {
   private TimekeepingRepositoryimp repository = new TimekeepingRepositoryimp();
    Timekeeping timekeeping = TimekeepingFactory.buildTimekeepingService(1000,1500,"LM88");



    public void testGetRepository() {
    }

    public void testCreate() {
        Timekeeping cExpected = repository.create(timekeeping);
        Assert.assertEquals(cExpected.getempID(),timekeeping.getempID());


    }

    public void testRead() {

        Timekeeping rTimekeepings  = repository.read(timekeeping.getempID());
    Assert.assertNotNull(rTimekeepings);
    }

    public void testUpdate() {
        Timekeeping rTimekeepingservice = new Timekeeping.Builder()
                .setEmployee_id("LM88")
                .setTime_In(1500)
                .setTime_Out(2100)
                .copy(timekeeping)
                .build();

        Assert.assertEquals(rTimekeepingservice.getempID(),"LM878");
    }

    public void testDelete() {
repository.delete(timekeeping.getempID());
Assert.assertNotNull(timekeeping.getempID());
    }

    public void testGetAll() {

        Assert.assertNotNull(repository.getAll());
    }
}