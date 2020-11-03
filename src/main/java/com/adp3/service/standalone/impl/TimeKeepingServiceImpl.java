package com.adp3.service.standalone.impl;

import com.adp3.repository.standalone.TimekeepingRepository;
import com.adp3.repository.standalone.impl.TimekeepingRepositoryimp;
import com.adp3.service.standalone.TimeKeepingServices;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class TimeKeepingServiceImpl implements TimeKeepingServices {

    private static TimeKeepingServiceImpl service=null;

    private TimekeepingRepository repository;

    private TimeKeepingServiceImpl(){
        this.repository= TimekeepingRepositoryimp.getRepository();
        }

    public static TimeKeepingServiceImpl getService() {
        if(service == null) service= new TimeKeepingServiceImpl();
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
    public boolean delete(String s) {
repository.delete(s);
        return false;
    }


///------------------------------


}
