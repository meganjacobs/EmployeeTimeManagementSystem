package com.adp3.service.reports.impl;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.repository.reports.LeaveReportRepository;
import com.adp3.service.reports.LeaveReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportServiceImpl - implementation of LeaveReportService as a concrete class
 */
@Service
public class LeaveReportServiceImpl implements LeaveReportService {

    @Autowired
    private static LeaveReportRepository repository;

    @Override
    public LeaveReport create(LeaveReport t) {

        try{ repository.save(t);
        }
        catch(Exception e){
            if (repository.existsById(t.getLeaveReportID())){
                System.out.println("Record exists: " + t.getLeaveReportID());
            }
        }return t;
    }

    @Override
    public LeaveReport read(String s) {
        return repository.getOne(s);
    }

    @Override
    public LeaveReport update(LeaveReport t) {
        if (repository.existsById(t.getLeaveReportID())){
        return repository.save(t);}
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
/*
    @Override
    public Set<LeaveReport> index() {
        try{}
        catch(Exception e){}
        return null;
    }

    @Override
    public Set<LeaveReport> findByName() {
        return null;
    }

    @Override
    public Set<LeaveReport> findByID() {
        return null;
    }

 */

}
