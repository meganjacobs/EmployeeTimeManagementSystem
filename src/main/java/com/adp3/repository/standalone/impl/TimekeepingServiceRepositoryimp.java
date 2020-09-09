/*
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Class Description: TimekeepingServiceFactoryInpl
 * */

package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.TimekeepingService;
import com.adp3.repository.standalone.TimekeepingServiceRepository;

import java.util.*;

public class TimekeepingServiceRepositoryimp implements TimekeepingServiceRepository {
    private static TimekeepingServiceRepositoryimp repository =null;
    private Map<String, com.adp3.entity.standalone.TimekeepingService> TimekeepingService;
    TimekeepingServiceRepositoryimp()
    {
        this.TimekeepingService = new HashMap<>();}

    public static TimekeepingServiceRepository getRepository() {
        if(repository==null)repository=new TimekeepingServiceRepositoryimp();
        return repository;
    }
    @Override
    public TimekeepingService create(TimekeepingService TimekeepingService) {
        this.TimekeepingService.put(TimekeepingService.getempID(),TimekeepingService);

        return TimekeepingService;
    }
    @Override
    public TimekeepingService read(String TimekeepingServiceID) {
        return this.TimekeepingService.get(TimekeepingServiceID);
    }

    public TimekeepingService update(TimekeepingService TimekeepingServiceIn) {
//        this.TimekeepingService.replace(TimekeepingServiceIn.getempID(),TimekeepingServiceIn);
//
//        return this.TimekeepingService.get(TimekeepingServiceIn.getempID());


        if(this.read(TimekeepingServiceIn.getempID())==null){
            this.delete(TimekeepingServiceIn.getempID());
            this.create(TimekeepingServiceIn);
        }

        return TimekeepingServiceIn;
    }

    @Override
    public boolean delete(String s) {
        this.TimekeepingService.remove(s);
        return false;
    }

    @Override
    public Set<TimekeepingService> getAll() {
        Collection<TimekeepingService> timekeepingServices =this.TimekeepingService.values();
        Set<TimekeepingService> set =new HashSet<>();
        set.addAll(timekeepingServices);
        return set;

    }




}
