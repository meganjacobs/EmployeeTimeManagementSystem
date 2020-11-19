///*
// * Author: Lungisa Lucky Mkhasakhasa
// * Class: Part Time
// * Student number: 216060117
// * Class Description: TimekeepingServiceFactoryInpl
// * */
//
//package com.adp3.repository.standalone.impl;
//
//import com.adp3.entity.standalone.Timekeeping;
//import com.adp3.repository.standalone.TimekeepingRepository;
//import com.adp3.repository.standalone.TimekeepingRepository;
//
//import java.util.*;
//
//public class TimekeepingRepositoryimp implements TimekeepingRepository {
//    private static TimekeepingRepositoryimp repository =null;
//    private Map<String, com.adp3.entity.standalone.Timekeeping> TimekeepingService;
//    TimekeepingRepositoryimp()
//    {
//        this.TimekeepingService = new HashMap<>();}
//
//    public static TimekeepingRepository getRepository() {
//        if(repository==null)repository=new TimekeepingRepositoryimp();
//        return repository;
//    }
//    @Override
//    public Timekeeping create(Timekeeping Timekeeping) {
//        this.TimekeepingService.put(Timekeeping.getempID(),Timekeeping);
//
//        return Timekeeping;
//    }
//    @Override
//    public Timekeeping read(String TimekeepingServiceID) {
//        return this.TimekeepingService.get(TimekeepingServiceID);
//    }
//
//    public Timekeeping update(Timekeeping TimekeepingServiceIn) {
////        this.TimekeepingService.replace(TimekeepingServiceIn.getempID(),TimekeepingServiceIn);
////
////        return this.TimekeepingService.get(TimekeepingServiceIn.getempID());
//
//
//        if(this.read(TimekeepingServiceIn.getempID())==null){
//            this.delete(TimekeepingServiceIn.getempID());
//            this.create(TimekeepingServiceIn);
//        }
//
//        return TimekeepingServiceIn;
//    }
//
//    @Override
//    public void delete(String s) {
//        this.TimekeepingService.remove(s);
//
//    }
//
//    @Override
//    public Set<Timekeeping> getAll() {
//        Collection<Timekeeping> timekeepingServices =this.TimekeepingService.values();
//        Set<Timekeeping> set =new HashSet<>();
//        set.addAll(timekeepingServices);
//        return set;
//
//    }
//
//
//
//
//}
