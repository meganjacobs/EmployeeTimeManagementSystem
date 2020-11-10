package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.repository.bridge.EmployeeStoreRepository;
import com.adp3.service.bridge.EmployeeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreServiceImpl
 */

@Service
public class EmployeeStoreServiceImpl implements EmployeeStoreService {

    private static EmployeeStoreService empStoreService = null;
    @Autowired
    EmployeeStoreRepository  empStoreDB;

    @Override
    public Set<EmployeeStore> getAll()
    {
        return this.empStoreDB.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public EmployeeStore create(EmployeeStore t)
    {
        this.empStoreDB.save(t);
        return t;
    }

    @Override
    public EmployeeStore read(String s)
    {
        return this.empStoreDB.findById(s).orElse(null);
    }

    @Override
    public EmployeeStore update(EmployeeStore t)
    {
        return this.empStoreDB.save(t);
    }

    @Override
    public void delete(String s)
    {
        this.empStoreDB.deleteById(s);
    }
}
