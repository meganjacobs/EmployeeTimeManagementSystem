/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactoryTest
 */


package com.adp3.factory;

import com.adp3.entity.reports.StoreReport;
import com.adp3.factory.reports.StoreReportFactory;
import org.junit.Assert;
import org.junit.Test;

public class StoreReportFactoryTest {

    StoreReport storeReport = StoreReportFactory.createStoreReports("Admin");

     @Test
    public void getStoreReports() throws Exception {

        Assert.assertNotNull(storeReport);
        Assert.assertNotNull(storeReport.getReportID());
        Assert.assertEquals(storeReport.getReportDesc(),"Admin");

         System.out.println(storeReport);

    }

}