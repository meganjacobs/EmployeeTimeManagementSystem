package com.adp3.factory.bridge;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.factory.bridge.EmployeeLeaveFactory;
import org.junit.Assert;
import org.junit.Test;
/*
* Zubair Van Oudtshoorn
*
* Unit Tests
* */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class EmployeeLeaveFactoryTest {
    //create Object , assign values
    EmployeeLeave employeeLeave = EmployeeLeaveFactory.calcEmployeeLeave("A16", "A1", new Date(2020,6,02), new Date(2020,6,05));


    @Test
    public void leaveIDNotNull() {
        // Test leaveID is not null
        Assert.assertNotNull(employeeLeave.getLeaveID());
    }
    @Test
    public void getEmployeeLeaveValues(){
        //Test all values are being received
        assertSame("A16",employeeLeave.getEmpID());
        Assert.assertEquals(employeeLeave.getLeaveID(), "A1");
        assertEquals(new Date(2020,6,02), employeeLeave.getStartDate());
        assertEquals(new Date(2020,6,05), employeeLeave.getEndDate());

    }

}