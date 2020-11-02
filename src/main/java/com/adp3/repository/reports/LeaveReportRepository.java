package com.adp3.repository.reports;

import com.adp3.entity.reports.LeaveReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportRepository - extends JpaRepository framework incl. interface and implementations
 */
@Repository
public interface LeaveReportRepository extends JpaRepository<LeaveReport,String> {

}
