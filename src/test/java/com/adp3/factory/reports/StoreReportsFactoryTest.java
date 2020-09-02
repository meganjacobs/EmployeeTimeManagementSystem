/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactoryTest
 */


package com.adp3.factory.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportFactory;
import org.junit.Assert;
import org.junit.Test;

public class StoreReportsFactoryTest {

    StoreReports storeReports = StoreReportFactory.createStoreReports("Admin");

     @Test
    public void getStoreReports() throws Exception {

        Assert.assertNotNull(storeReports);
        Assert.assertNotNull(storeReports.getReportID());
        Assert.assertEquals(storeReports.getReportDesc(),"Admin");

         System.out.println(storeReports);

    }

}