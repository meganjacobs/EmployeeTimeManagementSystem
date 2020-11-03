package com.adp3.repository.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.repository.IRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface StoreReportsRepository extends IRepository<StoreReports, String>  {


    Set<StoreReports> getAll();
}
