package com.adp3.entity;
/*
 *Zangwa Steve
 * 217136664
 * Using builder pattern
 */

public class StoreReport {
    private String reportID, reportDesc, storedID;

    private StoreReport(Builder builder) {
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
        return "StoreReport{" +
                "ReportID='" + reportID + '\'' +
                ", ReportDesc='" + reportDesc + '\'' +
                ", StoredID='" + storedID + '\'' +
                '}';
    }

    public static class Builder {
        public String reportID;
        public String storedID;
        private String reportDesc;

        public void setReportID(String reportID) {
            this.reportID = reportID;
        }

        public void setReportDec(String reportDec) {
            reportDesc = reportDec;
        }

        public void setStoredID(String storedID) {
            this.storedID = storedID;
        }

        public Builder copy(StoreReport storeReport) {
            this.reportID = storeReport.reportID;
            this.storedID = storeReport.storedID;
            this.reportDesc = storeReport.reportDesc;

            return this;
        }

        public StoreReport build() {
            return new StoreReport(this);
        }
    }

}


