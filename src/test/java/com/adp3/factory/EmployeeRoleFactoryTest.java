package com.adp3.factory;

import com.adp3.entity.EmployeeRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: EmployeeRoleFactory Test
 */

public class EmployeeRoleFactoryTest {

    public static void beforeClass() throws Exception {
        EmployeeRole empR = EmployeeRoleFactory.getEmployeeRole("1001M", "Manager");


    }

    @Test
    public void getEmployeeRole() {
        //Testing object is sets values inserted
        EmployeeRole empR = new EmployeeRole.Builder()
                .setEmployeeId("1002G")
                .setRoleId("General")
                .build();
        assertEquals("1002G" + "General", empR.getEmpID() + empR.getRoleID());
        System.out.println(empR.toString());

    }

    @Test
    public void multipleObjects() {
        //Testing object are not the same
        EmployeeRole empR2 = new EmployeeRole.Builder()
                .setEmployeeId("1001M")
                .setRoleId("Manager")
                .build();
        EmployeeRole empR1 = new EmployeeRole.Builder()
                .setEmployeeId("1002G")
                .setRoleId("General")
                .build();

        Assert.assertNotSame(empR1, empR2.toString());
        System.out.println(empR1);
        System.out.println(empR2);

    }
}
