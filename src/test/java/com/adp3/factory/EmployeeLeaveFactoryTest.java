package com.adp3.factory;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.factory.bridge.EmployeeLeaveFactory;
import org.junit.Assert;
import org.junit.Test;
/*
* Zubair Van Oudtshoorn
*
* Unit Tests
* */
import static org.junit.Assert.*;

public class EmployeeLeaveFactoryTest {
    //create Object , assign values
    EmployeeLeave employeeLeave = EmployeeLeaveFactory.calcEmployeeLeave("A16", "A1", "21/05/2020", "28/05/2020");


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
        assertSame("21/05/2020", employeeLeave.getStartDate());
        assertSame("28/05/2020", employeeLeave.getEndDate());

    }
}