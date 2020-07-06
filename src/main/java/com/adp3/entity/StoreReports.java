package com.adp3.entity;
/*
*Zangwa Steve
* 217136664
* Class Description : StoreReport
* Using builder pattern
 */

public class StoreReports {
    private String reportID, reportDesc, storedID;
    private StoreReports(StoreReports builder){
        this.reportID = builder.reportID;
        this.storedID = builder.storedID;
         this.reportDesc = builder.reportDesc;

    }
    public String getReportID() {
        return reportID;
    }
    public String getReportDesc() {
        return reportDesc;
    }

    public String getStoredID() {
        return storedID;
    }

    @Override
    public String toString() {
        return "Store_Reports{" +
                "ReportID='" + reportID + '\'' +
                ", ReportDesc='" + reportDesc + '\'' +
                ", StoredID='" + storedID + '\'' +
                '}';
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public void setReportDesc(String reportDesc) {
        this.reportDesc = reportDesc;
    }

    public void setStoredID(String storedID) {
        this.storedID = storedID;
    }

    public static class Builder {
        public String reportID;
        public String storedID;
        public String reportDesc;

        public void setReportID(String reportID) {
            this.reportID = reportID;
        }

        public void setReportDesc(String reportDesc) {
            this.reportDesc = reportDesc;
        }
        public void setStoredID(String storedID) {
            this.storedID = storedID;

        }
        public Builder copy (StoreReports storeReports){
            this.reportID = storeReports.reportID;
            this.storedID = storeReports.storedID;
            this.reportDesc = storeReports.reportDesc;
           return this;
        }

    }

    public StoreReports build() {  return new StoreReports(this);
    }

   private void generateReports(){

  }
}


