package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Leave;
import com.adp3.repository.standalone.LeaveRepository;
import com.adp3.repository.standalone.impl.LeaveRepositoryImpl;
import com.adp3.service.standalone.LeaveService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Author: Ayanda Nongxa
 * desc: Leave Service Implementation
 * Class: Part Time
 * *Student number: 204513723
 */
@Service
public class LeaveServiceImpl implements LeaveService {

    private static LeaveService service = null;
    private LeaveRepository repository;

    private LeaveServiceImpl() {
        this.repository = LeaveRepositoryImpl.getRepository();
    }

    public static LeaveService getService() {
        if (service == null) service = new LeaveServiceImpl();
        return service;

    }


    @Override
    public Leave create(Leave leave) {
        return this.repository.create(leave);
    }

    @Override
    public Leave read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Leave update(Leave leave) {
        return this.repository.update(leave);
    }

    @Override
    public void delete(String leaveID) {

        this.repository.delete(leaveID);

    }

    @Override
    public Set<Leave> getAll() {
        return this.repository.getAll();
    }
}

