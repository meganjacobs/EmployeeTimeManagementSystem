package com.adp3.repository;

import com.adp3.entity.LeaveReport;

import java.util.Set;

public interface LeaveReportRepository extends Repository <LeaveReport,String> {
    //Retrieves collection specific to LeaveReportRepository
    Set<LeaveReport> getAll();
}
