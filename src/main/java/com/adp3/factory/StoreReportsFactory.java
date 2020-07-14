package com.adp3.factory;

import com.adp3.entity.StoreReports;
import com.adp3.util.GenericHelper;

public class StoreReportsFactory {



    public static StoreReports createStoreReports(String reportID, String storeID, String reportDesc){

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
