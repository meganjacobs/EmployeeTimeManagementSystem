package com.adp3.repository;

import com.adp3.entity.LeaveReport;

import java.util.Set;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportRepository - extends member methods of parent "Repository"
 */

public interface LeaveReportRepository extends Repository <LeaveReport,String> {
    //Retrieves collection specific to LeaveReportRepository
    Set<LeaveReport> getAll();
}
