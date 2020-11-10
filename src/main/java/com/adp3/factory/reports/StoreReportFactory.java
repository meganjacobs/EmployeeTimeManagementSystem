/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactory
 */

package com.adp3.factory.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.util.GenericHelper;

public class StoreReportFactory {



    public static StoreReports createStoreReports(String empID, String storeID, String timeServiceID){
        String reportID = GenericHelper.generateID();
        return new StoreReports.Builder()
                .setStoreReportID(reportID)
                .setEmpID(empID).setStoreID(storeID).setTimeServiceID(timeServiceID)
                .build();

    }
}

