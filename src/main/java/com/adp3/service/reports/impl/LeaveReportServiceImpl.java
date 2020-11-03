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

    if (repository.existsById(t.getLeaveReportID())) {
            System.out.println("Record exists: " + t.getLeaveReportID());
        }
        else repository.save(t);
        return t;
    }

    @Override
    public LeaveReport read(String s) {
        return repository.findById(s).orElse(null);
    }

    @Override
    public LeaveReport update(LeaveReport t) {
          if (repository.existsById(t.getLeaveReportID())){
              LeaveReport updated = new LeaveReport.Builder()
                      .copy(t)
                      .setEmpID("emp002")
                      .setLeaveID("002")
                      .setStoreID("cpt002")
                      .build();
              updated = repository.save(updated);
              return updated;
        }
        else return null;
    }

    @Override
    public boolean delete(String s) {
        if (repository.existsById(s)){
        repository.deleteById(s);
        }
        else System.out.println("Record does not exist");
        return false;
    }

    @Override
    public Set<LeaveReport> getAll() {
       return repository.findAll().stream().collect(Collectors.toSet());
    }

}
