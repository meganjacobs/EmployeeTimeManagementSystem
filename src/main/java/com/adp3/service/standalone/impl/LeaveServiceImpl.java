package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Leave;
import com.adp3.repository.standalone.LeaveRepository;
import com.adp3.repository.standalone.impl.LeaveRepositoryImpl;
import com.adp3.service.standalone.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
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
    @Autowired
    private LeaveRepository repository;


    @Override
    public Leave create(Leave leave) {
        return this.repository.save(leave);
    }

    @Override
    public Leave read(String s) {
        return this.repository.findById(s).orElseGet(supplier: null);
    }

    @Override
    public Leave update(Leave leave) {
        if (this .repository.existsById(leave.id())){
        return this.repository.save(leave);
        }
        return null;
    }

    @Override
    public void delete(String leaveID) {

        this.repository.deleteById(leaveID);
        if(this.repository.deleteById(s)) return false;
        else return true

    }

    @Override
    public Set<Leave> getAll() {
        return this.repository.getAll();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveServiceImpl that = (LeaveServiceImpl) o;
        return Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }
}


