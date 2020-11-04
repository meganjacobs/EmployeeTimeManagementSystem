package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.repository.bridge.EmployeeLeaveRepository;
import com.adp3.service.bridge.EmpLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author Zubair Van Oudtshoorn
 * desc: Employess Leave Repository Implementation
 * Student#: 217203795
 */
@Service
public class EmpLeaveServiceImpl implements EmpLeaveService {

    //private static EmpLeaveService service = null;
    @Autowired
    private EmployeeLeaveRepository repository;
    @Override
    public EmployeeLeave create(EmployeeLeave employeeLeave) {
        return this.repository.save(employeeLeave);
    }

    @Override
    public EmployeeLeave read(String s) {
        return this.repository.findById(s).orElseGet(null);
    }

    @Override
    public EmployeeLeave update(EmployeeLeave employeeLeave) {
        if( this.repository.existsById(employeeLeave.getEmpID())){
            return this.repository.save(employeeLeave);}
        return null;
    }


    @Override
    public void delete(String empID) {

        if (repository.existsById(empID)){
            repository.deleteById(empID);
        }
        else System.out.println("No Available Record");

    }

    @Override
    public Set<EmployeeLeave> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
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


