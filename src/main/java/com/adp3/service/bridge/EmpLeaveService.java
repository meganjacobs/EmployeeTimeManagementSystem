package com.adp3.service.bridge;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.service.IService;

import java.util.Set;

public interface EmpLeaveService extends IService <EmployeeLeave, String>{
    Set<EmployeeLeave> getAll();




}


