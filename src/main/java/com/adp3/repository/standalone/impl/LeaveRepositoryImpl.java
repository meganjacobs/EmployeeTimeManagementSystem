package com.adp3.repository.standalone.impl;

import com.adp3.entity.standalone.Leave;
import com.adp3.repository.standalone.LeaveRepository;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number: 204513723

 */

public class LeaveRepositoryImpl implements LeaveRepository {

    private static LeaveRepository repository = null;
    private Set<Leave> leaveDB;
    public LeaveRepositoryImpl() {
        this.leaveDB = new HashSet<>();
    }

    public static LeaveRepository getRepository(){
        if (repository == null) {
            repository = new LeaveRepository() {

                @Override
                public Leave create(Leave t) {
                    return null;
                }

                @Override
                public Leave read(String s) {
                    return null;
                }

                @Override
                public Leave update(Leave t) {
                    return null;
                }

                @Override
                public void delete(String s) {

                }

                @Override
                public Set<Leave> getAll() {
                    return null;
                }
            };
        }
        return repository;

    }
    @Override
    public Leave create(Leave leave) {
        this.leaveDB.add(leave);
        return leave;
    }

    @Override
    public Leave read(String leaveID) {
        Leave leave =null;
        for(Leave l: this.leaveDB) {
            if (l.getLeaveID().equalsIgnoreCase(leaveID)) {
                leave = l;
                break;
            }
        }
        return leave;
    }

    @Override
    public Leave update(Leave leave) {
        //update the object
        Leave existingLeave = read(leave.getLeaveID());
        if(leave != null) {
            this.leaveDB.remove(existingLeave);
            this.leaveDB.add(leave);
        }

        return leave;
    }


    @Override
    public void delete (String leaveID) {
        Leave existingLeave = read(leaveID);
        if (existingLeave != null)
            this.leaveDB.remove(existingLeave);


    }

    @Override
    public Set<Leave> getAll() {
        return null;
    }
}
