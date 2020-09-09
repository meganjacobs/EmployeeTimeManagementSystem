package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.repository.bridge.EmployeeLeaveRepository;
import com.adp3.repository.bridge.impl.EmployeeLeaveRepositoryImpl;
import com.adp3.service.bridge.EmpLeaveService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zubair Van Oudtshoorn
 * desc: Employess Leave Repository Implementation
 * Student#: 217203795
 */

public class EmpLeaveServiceImpl implements EmpLeaveService {

    private static EmpLeaveService service = null;
    private EmployeeLeaveRepository repository;

    private EmpLeaveServiceImpl(){
        this.repository = EmployeeLeaveRepositoryImpl.getRepository();
    }

    public static EmpLeaveService getService(){
        if (service == null) service = new EmpLeaveServiceImpl();
        return service;

    }




    @Override
    public EmployeeLeave create(EmployeeLeave employeeLeave) {
        return this.repository.create(employeeLeave);
    }

    @Override
    public EmployeeLeave read(String s) {
        return this.repository.read(s);
    }

    @Override
    public EmployeeLeave update(EmployeeLeave employeeLeave) {
        return this.repository.update(employeeLeave);
    }

    @Override
    public void delete(String empID) {

        this.repository.delete(empID);

    }

    @Override
    public Set<EmployeeLeave> getAll() {
        return this.repository.getAll();
    }

}
