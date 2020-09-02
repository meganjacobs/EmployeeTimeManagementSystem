/**
 * Author: Steve Zangwa
 * Class: Part Time
 * Student number: 217136664
 * Description: Test methods of storeReportRepository (IRepository) implemented in its concrete class
 */


package com.adp3.repository.reports.impl;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportFactory;
import com.adp3.repository.reports.StoreReportsRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreReportsRepositoryImplTest {

    private static StoreReportsRepository storeReportsRepository = new StoreReportsRepositoryImpl();
    private StoreReports storeReports = StoreReportFactory.createStoreReports("Employee");


    @Test
    public void a_create() {
        StoreReports created = storeReportsRepository.create(storeReports);
        Assert.assertEquals(storeReports.getReportID(), created.getReportID());
        System.out.println("Create: " + created);
    }

    @Test
    public void b_read() {
        StoreReports read = storeReportsRepository.read(storeReports.getReportID());
        System.out.println("Read: "+ read);
    }

    @Test
    public void c_update() {
        StoreReports updated = new StoreReports.Builder().copy(storeReports).setReportDesc("Employee StoreReport").build();
        updated = storeReportsRepository.update(updated);
        System.out.println("Update: "+updated);
    }

    @Test
    public void e_delete() {
        storeReportsRepository.delete(storeReports.getReportID());
    }

    @Test
    public void d_getAll() {
        storeReportsRepository.delete(storeReports.getReportID());
    }
}