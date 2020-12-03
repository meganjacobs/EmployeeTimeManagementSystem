/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactoryTest
 */


package com.adp3.factory.reports;

import com.adp3.entity.reports.StoreReports;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

public class StoreReportsFactoryTest {

    StoreReports storeReports = StoreReportFactory.createStoreReports("empFactory","storeFactory","timeFactory");

    @Test
    public void createStoreReport()  {
        Assert.assertNotNull(storeReports);
        Assert.assertSame(storeReports.getEmpID(),"empFactory");
        Assert.assertSame(storeReports.getStoreID(),"storeFactory");
        Assert.assertSame(storeReports.getRecID(),"timeFactory");
        Assert.assertNotEquals(storeReports.getStoreReportID(), "00000000");
        System.out.println(storeReports);

    }

}