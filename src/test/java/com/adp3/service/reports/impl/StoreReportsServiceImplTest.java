package com.adp3.service.reports.impl;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportFactory;
import com.adp3.service.reports.StoreReportsService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoreReportsServiceImplTest {

    @Autowired
    StoreReportsService storeReportsService;
    private StoreReports storeReports;

    @Before
    public void a_a(){
        storeReports = StoreReportFactory.createStoreReports("Employee","Store","In");
        storeReportsService.create(storeReports);
    }

    @Test
    public void d_getAll() {
        Set<StoreReports> storeReports = storeReportsService.getAll();
        System.out.println("All StoreReports: " + storeReports);
    }

    @Test
    public void a_create() {
        StoreReports created = storeReportsService.create(storeReports);
        System.out.println("Created: "+ created);
    }

    @Test
    public void b_read() {
        StoreReports read = storeReportsService.read(storeReports.getStoreReportID());
        System.out.println("Read: "  + read);
    }

    @Test
    public void c_update() {
        StoreReports updated = new StoreReports.Builder().copy(storeReports).setEmpID("Employee")
                .setStoreID("Store").setTimeServiceID("Out").build();
        updated = storeReportsService.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        storeReportsService.delete(storeReports.getStoreReportID());
    }
}