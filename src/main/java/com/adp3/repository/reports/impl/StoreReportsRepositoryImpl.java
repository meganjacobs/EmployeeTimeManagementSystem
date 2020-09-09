/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Description: LeaveReportRepositoryImpl - implementation of LeaveReportRepository as a concrete class
 */

package com.adp3.repository.reports.impl;

import com.adp3.entity.reports.StoreReports;
import com.adp3.repository.reports.StoreReportsRepository;

import java.util.HashSet;
import java.util.Set;

public class StoreReportsRepositoryImpl implements StoreReportsRepository {

    private static StoreReportsRepository repository = null;

    private Set<StoreReports> storeReportsDB;
    public StoreReportsRepositoryImpl(){
        this.storeReportsDB = new HashSet<>();
    }

    public static StoreReportsRepository getRepository(){
        if (repository == null) repository = new StoreReportsRepositoryImpl();
        return repository;

    }

    /*method used to create a new StoreReport
     * @param: StoreReportDesc
     * @return: StoreReport
     * */
        @Override
    public StoreReports create(StoreReports storeReports) {

            this.storeReportsDB.add(storeReports);
            return storeReports;
    }

    /*method used to read StoreReport
     * @param: StoreReportDesc
     * @return: StoreReport
     * */
    @Override
    public StoreReports read(String storeReportsId) {
        StoreReports storeReports = null;
        for(StoreReports storeReports1 : this.storeReportsDB) {
            if (storeReports1.getReportID().equalsIgnoreCase(storeReportsId)) {
                storeReports = storeReports1;
                break;
            }
        }
        return storeReports;
    }

    /*method used to update StoreReport
     * @param: StoreReportDesc
     * @return: StoreReport
     * */
    @Override
    public StoreReports update (StoreReports storeReports) {
        StoreReports oldStoreReports = read(storeReports.getReportID());
        if (oldStoreReports != null) {
            this.storeReportsDB.remove(oldStoreReports);
            this.storeReportsDB.add(storeReports);
        }
        return storeReports;
    }
    /*method used to delete StoreReport
     * @param: StoreReportDesc
     * @return: StoreReport
     * */
    @Override
    public void delete(String storeReportsId) {
        StoreReports storeReports = read(storeReportsId);
        if (storeReports != null)
            this.storeReportsDB.remove(storeReports);
    }
    /*method used to retrieve Collection of StoreReport
     * @param: void
     * @return: Set
     * */
    @Override
    public Set<StoreReports> getAll(){
        return this.storeReportsDB;
    }
}
