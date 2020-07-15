package com.adp3.entity;
/*
*Zangwa Steve
* 217136664
* Class Description : StoreReport
* Using builder pattern
 */

public class StoreReports {
    private String reportID, reportDesc, storeID;
    public StoreReports(Builder builder){
        this.reportID = builder.reportID;
        this.storeID = builder.storeID;
         this.reportDesc = builder.reportDesc;

    }
    public String getReportID() {
        return reportID;
    }
    public String getReportDesc() {
        return reportDesc;
    }

    public String getStoreID() {
        return storeID;
    }

    @Override
    public String toString() {
        return "Store_Reports{" +
                "ReportID='" + reportID + '\'' +
                ", ReportDesc='" + reportDesc + '\'' +
                ", StoredID='" + storeID + '\'' +
                '}';
    }

    public void getReportID(String reportID) {
        this.reportID = reportID;
    }

    public void getReportDesc(String reportDesc) {
        this.reportDesc = reportDesc;
    }

    public void getStoreID(String storeID) {
        this.storeID = storeID;
    }

    public static class Builder {
       private String reportID,storeID, reportDesc;

        public Builder setReportID(String reportID) {
            this.reportID = reportID;
            return this;

        }

        public Builder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public Builder setReportDesc(String reportDesc) {
            this.reportDesc = reportDesc;
            return this;
        }

        public Builder copy (StoreReports storeReports){
            this.reportID = storeReports.reportID;
            this.storeID = storeReports.storeID;
            this.reportDesc = storeReports.reportDesc;
           return this;
        }
        public StoreReports build() {
            return new StoreReports(this);
        }


    }


}


