package com.adp3.service.reports.impl;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.repository.reports.LeaveReportRepository;
import com.adp3.repository.reports.impl.LeaveReportRepositoryImpl;
import com.adp3.service.reports.LeaveReportService;

import java.util.Set;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Description: LeaveReportServiceImpl - implementation of LeaveReportService as a concrete class
 */

public class LeaveReportServiceImpl implements LeaveReportService {
    private static LeaveReportService service = null;
    private static LeaveReportRepository repository;

    private LeaveReportServiceImpl (){
        this.repository = LeaveReportRepositoryImpl.getRepository();  }

        public static LeaveReportService getService(){
        if (service == null) service = new LeaveReportServiceImpl();
        return service;
    }

    @Override
    public LeaveReport create(LeaveReport t) {

        try{ this.repository.create(t);
        }
        catch(Exception e){
            if (repository!= null){

            }
        }return t;
    }

    @Override
    public LeaveReport read(String s) {
        return this.repository.read(s);
    }

    @Override
    public LeaveReport update(LeaveReport t) {
        return this.repository.update(t);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);

    }

    @Override
    public Set<LeaveReport> getAll() {
        return this.repository.getAll();
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
