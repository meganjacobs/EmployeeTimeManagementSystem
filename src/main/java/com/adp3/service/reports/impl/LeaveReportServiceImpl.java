package com.adp3.service.reports.impl;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.repository.reports.LeaveReportRepository;
import com.adp3.service.reports.LeaveReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportServiceImpl - implementation of LeaveReportService as a concrete class
 */
@Service
@Transactional
public class LeaveReportServiceImpl implements LeaveReportService {

    @Autowired
    LeaveReportRepository repository;


    @Override
    public LeaveReport create(LeaveReport t) {
        return repository.save(t);
    }

    @Override
    public LeaveReport read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public LeaveReport update(LeaveReport leaveReport) {
          if (this.repository.existsById(leaveReport.getLeaveReportID())){
             return this.repository.save(leaveReport);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        if (repository.existsById(s)){
        repository.deleteById(s);
        }
        else System.out.println("Record does not exist");
    }

    @Override
    public Set<LeaveReport> getAll() {
       return repository.findAll().stream().collect(Collectors.toSet());
    }

}
