package com.adp3.repository.reports;

import com.adp3.entity.reports.StoreReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface StoreReportsRepository extends JpaRepository<StoreReports, String> {


    <StoreReports> getAll();
}

