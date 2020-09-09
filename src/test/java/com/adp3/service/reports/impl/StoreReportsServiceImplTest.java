package com.adp3.service.reports.impl;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportFactory;
import com.adp3.repository.reports.StoreReportsRepository;
import com.adp3.repository.reports.impl.StoreReportsRepositoryImpl;
import com.adp3.service.reports.StoreReportsService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreReportsServiceImplTest {

    private static StoreReportsService storeReportsService = new StoreReportsServiceImpl();
    private StoreReports storeReports = StoreReportFactory.createStoreReports("Employee");


    @Test
    public void d_getAll() {
        Set<StoreReports> storeReports = storeReportsService.getAll();
        assertEquals(1, storeReports.size());
        System.out.println("All StoreReports: " + storeReports);

    }

    @Test
    public void a_create() {
        StoreReports created = storeReportsService.create(storeReports);
        Assert.assertEquals(storeReports.getReportID(), created.getReportID());
        System.out.println("Created: "+ created);

    }

    @Test
    public void b_ead() {

        StoreReports read = storeReportsService.read(storeReports.getReportID());
        System.out.println("Read: "  + read);
    }

    @Test
    public void c_update() {
        StoreReports updated = new StoreReports.Builder().copy(storeReports).setReportDesc("Rm,.").build();
        updated = storeReportsService.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        storeReportsService.delete(storeReports.getReportID());

    }
}