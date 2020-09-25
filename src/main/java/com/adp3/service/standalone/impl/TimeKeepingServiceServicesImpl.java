package com.adp3.service.standalone.impl;

import com.adp3.repository.standalone.TimekeepingServiceRepository;
import com.adp3.repository.standalone.impl.TimekeepingServiceRepositoryimp;
import com.adp3.service.standalone.TimeKeepingServices;

import java.util.Set;

public class TimeKeepingServiceServicesImpl implements TimeKeepingServices {

    private static TimeKeepingServiceServicesImpl service=null;

    private TimekeepingServiceRepository repository;

    private TimeKeepingServiceServicesImpl(){
        this.repository= TimekeepingServiceRepositoryimp.getRepository();
        }

    public static TimeKeepingServiceServicesImpl getService() {
        if(service == null) service= new TimeKeepingServiceServicesImpl();
        return service;
    }

    @Override
    public Set<TimeKeepingServices> getAll() {
        //return repository.getAll();
        return null;

    }

    @Override
    public TimeKeepingServices create(TimeKeepingServices t) {
        //return repository.create(t);
        return null;

    }

    @Override
    public TimeKeepingServices read(String s) {
        //return repository.read(s);
        return null;

    }

    @Override
    public TimeKeepingServices update(TimeKeepingServices t) {
       // return repository.update(t);
        return null;
    }

    @Override
    public void delete(String s) {
repository.delete(s);
    }


///------------------------------


}
