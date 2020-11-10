package com.adp3.service.standalone.impl;
import com.adp3.entity.standalone.Employee;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.repository.standalone.TimekeepingRepository;
import com.adp3.service.standalone.TimeKeepingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

//
//@Service
//public class TimeKeepingServiceImpl implements TimeKeepingServices {
//    @Autowired
//    private TimekeepingRepository timekeepingRepository;
//
//    @Override
//    public Set<Employee> getAll() {
//        return timekeepingRepository.findAll().stream().collect(Collectors.toSet());
//    }
//
//    @Override
//    public Timekeeping create(Timekeeping t) {
//        return this.timekeepingRepository.save(t);
//    }
//
//    @Override
//    public Timekeeping read(String s) {
//        return this.timekeepingRepository.save(s);
//    }
//
//    @Override
//    public Timekeeping update(Employee t) {
//        return this.timekeepingRepository.existsById(t);
//    }
//
//    @Override
//    public void delete(String s) {
//
//
//    }
//}
