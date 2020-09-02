package com.adp3.repository.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.repository.IRepository;


import java.util.HashSet;
import java.util.Set;

/**
 * Author: Ayanda Nongxa
 * Class: Part Time
 * Student number: 204513723

 */
public class LeaveRepositoryImpl implements LeaveRepository {

    private Set<Leave> LeaveDB;

    public LeaveRepositoryImplRepositoryImpl(){
        this.LeaveDB = new HashSet<>();
    }



    public Leave read(String empId) {
        Leave Leave = null;
        for (Leave e : this.LeaveDB){
            if (e.getLeaveID().equalsIgnoreCase(leaveId)){
                leave = e;
                break;
            }
        }
        this.leaveDB.add(leave);
        return null;
    }

    @Override
    public Leave create(Leave leave) {
        this.leaveDB.add(leave);
        return leave;
    }


    @Override
    public Leave update(Leave leave) {
        Leave olLeave = read(leave.getleaveID());
        if (olleave != null);
        this.leaveDB.remove(olleave);
        this.leaveDB.add(leave);
        return leave;
    }

    @Override
    public void delete(String leaveId) {
        Leave leave = read(empId);
        if (leave !=null)this.leaveDB.remove(leave);

    }

    @Override
    public Set<leave> getAll() {
        return this.leaveDB;
    }
}
