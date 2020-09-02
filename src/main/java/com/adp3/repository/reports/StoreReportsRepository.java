package com.adp3.repository.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.repository.IRepository;

import java.util.Set;

public interface StoreReportsRepository extends IRepository<StoreReports, String>  {


    Set<StoreReports> getAll();
}
