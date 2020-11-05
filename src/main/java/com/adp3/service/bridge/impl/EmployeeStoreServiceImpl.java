package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.repository.bridge.EmployeeStoreRepository;
import com.adp3.repository.bridge.impl.EmployeeStoreRepositoryImpl;
import com.adp3.service.bridge.EmployeeStoreService;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.Set;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreServiceImpl
 */
@Service
public class EmployeeStoreServiceImpl implements EmployeeStoreService {

    private static EmployeeStoreService empStoreService = null;
    private EmployeeStoreRepository empStoreDB;

    EmployeeStoreServiceImpl() { this.empStoreDB = EmployeeStoreRepositoryImpl.getRepository(); }

    public static EmployeeStoreService getEmpStoreService() {
        if (empStoreService == null) empStoreService = new EmployeeStoreServiceImpl();
        return empStoreService;
    }

    @Override
    public Set<EmployeeStore> getAll()
    {
        return this.empStoreDB.getAll();
    }

    @Override
    public EmployeeStore create(EmployeeStore t)
    {
        this.empStoreDB.create(t);
        return t;
    }

    @Override
    public EmployeeStore read(String s)
    {
        return this.empStoreDB.read(s);
    }

    @Override
    public EmployeeStore update(EmployeeStore t)
    {
        return this.empStoreDB.update(t);
    }


    @Override
    public void delete(String s)
    {
        this.empStoreDB.delete(s);
    }
}
