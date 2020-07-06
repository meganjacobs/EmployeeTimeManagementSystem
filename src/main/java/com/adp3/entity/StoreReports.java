package com.adp3.entity;
/*
*Zangwa Steve
* 217136664
* Class Description : StoreReport
* Using builder pattern
 */

public class StoreReports {
    private String reportID, reportDesc, storeID;
    private StoreReports(StoreReports builder){
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

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public void setReportDesc(String reportDesc) {
        this.reportDesc = reportDesc;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public static class Builder {
        public String reportID;
        public String storeID;
        public String reportDesc;

        public void setReportID(String reportID) {
            this.reportID = reportID;
        }

        public void setReportDesc(String reportDesc) {
            this.reportDesc = reportDesc;
        }
        public void setStoreID(String storeID) {
            this.storeID = storeID;

        }
        public Builder copy (StoreReports storeReports){
            this.reportID = storeReports.reportID;
            this.storeID = storeReports.storeID;
            this.reportDesc = storeReports.reportDesc;
           return this;
        }

    }

    public StoreReports build() {  return new StoreReports(this);
    }

   private void generateReports(){

  }
}


