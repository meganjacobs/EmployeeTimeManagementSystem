package com.adp3.repository.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportRepository - extends member methods of parent "IRepository"
 */

public interface LeaveReportRepository extends JpaRepository<LeaveReport,String> {

}
