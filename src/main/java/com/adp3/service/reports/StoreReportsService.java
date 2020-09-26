package com.adp3.service.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.service.IService;

import java.util.Set;

public interface StoreReportsService extends IService<StoreReports, String> {

    Set<StoreReports> getAll();
}
