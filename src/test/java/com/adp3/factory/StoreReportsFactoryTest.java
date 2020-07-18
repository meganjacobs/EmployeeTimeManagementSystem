/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactoryTest
 */


package com.adp3.factory;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportsFactory;
import org.junit.Assert;
import org.junit.Test;

public class StoreReportsFactoryTest {

    StoreReports storeReports = StoreReportsFactory.createStoreReports("23","Admin");

     @Test
    public void getStoreReports() throws Exception {

        Assert.assertNotNull(storeReports);
        Assert.assertNotNull(storeReports.getReportID());
        Assert.assertEquals(storeReports.getStoreID(),"23");
        Assert.assertEquals(storeReports.getReportDesc(),"Admin");

         System.out.println(storeReports);

    }

}