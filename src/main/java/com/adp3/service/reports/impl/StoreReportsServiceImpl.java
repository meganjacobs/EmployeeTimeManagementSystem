package com.adp3.service.reports.impl;

import com.adp3.entity.reports.StoreReports;
import com.adp3.repository.reports.StoreReportsRepository;
import com.adp3.repository.reports.impl.StoreReportsRepositoryImpl;
import com.adp3.service.reports.StoreReportsService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class  StoreReportsServiceImpl implements StoreReportsService {


    private static StoreReportsService storeReportsService = null;
    private StoreReportsRepository repository;
    public StoreReportsServiceImpl() {
        this.repository = StoreReportsRepositoryImpl.getRepository();

    }
        public static StoreReportsService getService() {
            if (storeReportsService == null) storeReportsService = new StoreReportsServiceImpl();
            return storeReportsService;

    }


    @Override
    public Set<StoreReports> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StoreReports create(StoreReports storeReports) {
        return this.repository.create(storeReports);
    }

    @Override
    public StoreReports read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StoreReports update(StoreReports storeReports) {
        return this.repository.update(storeReports);
    }

    @Override
    public void delete(String s) {
      this.repository.delete(s);

    }
}
