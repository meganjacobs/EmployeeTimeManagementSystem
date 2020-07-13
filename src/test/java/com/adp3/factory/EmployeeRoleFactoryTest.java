package com.adp3.factory;

import com.adp3.entity.EmployeeRole;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeRoleFactoryTest {

    public static void beforeClass() throws Exception {
        EmployeeRole empR = EmployeeRoleFactory.getEmployeeRole("1001M","Manager");


    }


    @Test
    public void getEmployeeRole() {

          EmployeeRole empR= new EmployeeRole.Builder()
                    .setEmployeeId("1002G")
                    .setRoleId("General")
                    .build();
            assertEquals(empR.getEmpID(),empR.getEmpID());
            System.out.println(empR.toString());

    }


}
