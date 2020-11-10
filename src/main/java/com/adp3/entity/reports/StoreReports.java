package com.adp3.entity.reports;
/*
 *Zangwa Steve
 * 217136664
 * Class Description : StoreReport
 * Using builder pattern
 */


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class StoreReports implements Serializable {
    @Id
    private String storeReportID;
    private String empID, storeID, timeServiceID;

    public StoreReports(Builder builder) {
        this.storeReportID = builder.storeReportID;
        this.empID = builder.empID;
        this.storeID = builder.storeID;
        this.timeServiceID = builder.timeServiceID;
    }

    protected StoreReports() {
    }

    public String getStoreReportID() {
        return storeReportID;
    }

    public String getEmpID() { return empID; }

    public String getStoreID() { return storeID; }

    public String getTimeServiceID() { return timeServiceID; }

    @Override
    public String toString() {
        return "Store_Reports{" +
                "StoreReportID='" + storeReportID + '\'' +
                ", EmployeeID='" + empID + '\'' +
                ", StoreID='" + storeID + '\'' +
                '}';
    }

    public static class Builder {
        private String storeReportID, empID, storeID, timeServiceID;

        public Builder setStoreReportID(String storeReportID) {
            this.storeReportID = storeReportID;
            return this;
        }

        public Builder setEmpID(String empID) {
            this.empID = empID;
            return this;
        }

        public Builder setStoreID(String storeID) {
            this.storeID = storeID;
            return this;
        }

        public Builder setTimeServiceID(String timeServiceID) {
            this.timeServiceID = timeServiceID;
            return this;
        }

        public StoreReports build() {
            return new StoreReports(this);
        }

        public Builder copy(StoreReports storeReports) {
            this.storeReportID = storeReports.storeReportID;
            this.empID = storeReports.empID;
            this.storeID = storeReports.storeID;
            this.timeServiceID = storeReports.timeServiceID;
            return this;
        }


    }


}


