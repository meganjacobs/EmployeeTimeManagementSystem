package com.adp3.service.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.service.IService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportService - extends member methods of parent "IService"
 */

public interface LeaveReportService extends IService <LeaveReport,String> {
    //Retrieves collection specific to LeaveReportService
    Set<LeaveReport> getAll();
    /*
     List<LeaveReport> findAll(Sort var1); // sorts LeaveReports
    List<LeaveReport> findAllById(Iterable<ID> var1); // find LeaveReportsByID
    */
}
