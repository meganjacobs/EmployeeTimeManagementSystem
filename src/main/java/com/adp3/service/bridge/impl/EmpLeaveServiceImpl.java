package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.repository.bridge.EmployeeLeaveRepository;
import com.adp3.repository.bridge.impl.EmployeeLeaveRepositoryImpl;
import com.adp3.service.bridge.EmpLeaveService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Zubair Van Oudtshoorn
 * desc: Employess Leave Repository Implementation
 * Student#: 217203795
 */
@Service
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

    /*@Override
    public void EmpLeave() throws ParseException{



            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date firstDate = sdf.parse("06/24/2017");
            Date secondDate = sdf.parse("06/30/2017");

            long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            //assertEquals(diff, 6);
        }*/

    }


