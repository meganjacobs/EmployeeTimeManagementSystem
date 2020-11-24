

/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactoryTest
 * */

package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Timekeeping;
import com.adp3.factory.standalone.TimekeepingFactory;
import com.adp3.repository.standalone.TimekeepingRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TimekeepingRepositoryimpTest{
   @Autowired
   private static TimekeepingRepository repository ;
   private Timekeeping timekeeping = TimekeepingFactory.buildTimekeepingService(1000,1500,"LM88");


        @Test
        public void testCreate() {
        Timekeeping create = repository.save(timekeeping);
        assertEquals(create.getempID(),timekeeping.getempID());
            assertEquals(timekeeping.getempID(),timekeeping.getempID());
            assertEquals(timekeeping.getTime_In(),timekeeping.getTime_In());
            assertEquals(timekeeping.getTime_Out(),timekeeping.getTime_Out());
        }
    @Test
    public void testRead(String s) {

        Timekeeping rTimekeepings  = repository.findById(timekeeping.getempID()).orElse(null);
    }
        @Test
    public void testUpdate() {
        Timekeeping rTimekeepingservice = new Timekeeping.Builder()
                .setEmployee_id("LM88")
                .setTime_In(1500)
                .setTime_Out(2100)
                .copy(timekeeping)
                .build();

        assertEquals(rTimekeepingservice.getempID(),"LM878");
    }
@Test
    public void testDelete() {

       this.repository.deleteById(timekeeping.getempID());
    }
@Test
    public void testGetAll() {

        Assert.assertNotNull(timekeeping.getempID());
    }
}