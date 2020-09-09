package com.adp3.repository.bridge.impl;
import org.junit.Assert.*;
import com.adp3.entity.bridge.EmployeeStore;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreRepositoryImp
 */

public class EmployeeStoreRepositoryImp implements EmployeeStoreRepository {

    private static EmployeeStoreRepository repository  = null;
    private Set<EmployeeStore> empStoreDB;

    private EmployeeStoreRepositoryImp(){ this.empStoreDB = new HashSet<>(); }

    public static EmployeeStoreRepository getRepository(){
        if(repository == null)  repository = new EmployeeStoreRepositoryImp();
        return repository;
    }

    @Override
    public Set<EmployeeStore> getAll() {
        return this.empStoreDB;

    }

    @Override
    public EmployeeStore create(EmployeeStore t) {
        this.empStoreDB.add(t);
        return t;

    }

    @Override
    public EmployeeStore read(String s) {

        for(EmployeeStore em : this.empStoreDB) {
            if(em.getStoreID().equalsIgnoreCase(s)) return em;
            if(em.getEmpID().equalsIgnoreCase(s)) return em;
            return em;
        }
        return null;
    }

    @Override
    public EmployeeStore update(EmployeeStore t) {


        EmployeeStore EmpStore = read(t.getEmpID());
        if (EmpStore != null);
        this.empStoreDB.remove(EmpStore);
        this.empStoreDB.add(t);
        return t;
        }



    @Override
    public void delete(String s) {

        EmployeeStore empStore = read(s);
        if (empStore !=null)this.empStoreDB.remove(empStore);


    }
}
