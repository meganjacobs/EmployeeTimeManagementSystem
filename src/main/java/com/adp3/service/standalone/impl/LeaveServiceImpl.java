package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Leave;
import com.adp3.repository.standalone.LeaveRepository;
import com.adp3.service.standalone.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Ayanda Nongxa
 * desc: Leave Service Implementation
 * Class: Part Time
 * *Student number: 204513723
 */
@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveRepository repository;


    @Override
    public Leave create(Leave leave) {
        return this.repository.save(leave);
    }

    @Override
    public Leave read(String s) {
        return this.repository.findById(s).orElseGet( null);
    }

    @Override
    public Leave update(Leave leave) {
        if (this .repository.existsById(leave.getLeaveID())){
            return this.repository.save(leave);
        }
        return null;
    }

    @Override
    public void delete(String leaveID) {

        this.repository.deleteById(leaveID);
    }

    @Override
    public Set<Leave> getAll() {
        return repository.findAll().stream().collect(Collectors.toSet());
    }

}