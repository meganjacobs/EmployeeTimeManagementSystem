/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Factory: StoreReportsFactory
 */

package com.adp3.factory;

import com.adp3.entity.StoreReports;
import com.adp3.util.GenericHelper;

public class StoreReportsFactory {



    public static StoreReports createStoreReports( String storeID, String reportDesc){
        String reportID = GenericHelper.generateID();
        StoreReports storeReports;
        StoreReports.Builder builder = new StoreReports.Builder();
        builder.setReportID(reportID);
        builder.setStoreID(storeID);
        builder.setReportDesc(reportDesc);
        storeReports = builder
                .build();
        return storeReports;
    }

}
