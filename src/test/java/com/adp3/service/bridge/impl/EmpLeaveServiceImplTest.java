package com.adp3.service.bridge.impl;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.factory.bridge.EmployeeLeaveFactory;
import com.adp3.repository.bridge.EmployeeLeaveRepository;
import com.adp3.repository.bridge.impl.EmployeeLeaveRepositoryImpl;
import com.adp3.service.bridge.EmpLeaveService;
import com.adp3.util.GenericHelper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Date;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpLeaveServiceImplTest {


    private static EmpLeaveService service = EmpLeaveServiceImpl.getService();
    private static String empID = GenericHelper.generateID();
    private static EmployeeLeave empLeave = EmployeeLeaveFactory.calcEmployeeLeave(empID,"3",new Date(2020,6,02), new Date(2020,6,05));


    @Test
    public void a_create() {

        EmployeeLeave created = service.create(empLeave);
        Assert.assertEquals(empLeave.getEmpID(), created.getEmpID());
        System.out.println("CREATED: "+ created);

    }

    @Test
    public void b_read() {

        EmployeeLeave read = service.read(empLeave.getEmpID());
        System.out.println("READ: " + read);

    }

    @Test
    public void c_update() {

        EmployeeLeave updated = new EmployeeLeave.Builder().copy(empLeave).setLeaveID("1").setStartDate(new Date(2020,6,02))
                .setEndDate(new Date(2020,6,05)).build();
        updated = service.update(updated);
        System.out.println("UPDATED: "+ updated);
    }

    @Test
    public void e_delete() {

        service.delete(empLeave.getEmpID());
        System.out.println("RECORD HAS BEEN DELETED"  );
    }

    @Test
    public void d_getAll() {

        Set<EmployeeLeave> employeeLeaves = service.getAll();
        assertEquals(1,employeeLeaves.size());
        System.out.println("TOTAL LEAVE TAKEN:" + employeeLeaves.size());
    }
}