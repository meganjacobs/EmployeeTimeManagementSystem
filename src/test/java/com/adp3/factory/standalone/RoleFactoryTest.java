package com.adp3.factory.standalone;

import com.adp3.factory.standalone.RoleFactory;
import com.adp3.entity.standalone.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

  /*Sanele Ngwenya
216019699
part time
 */

public class RoleFactoryTest {

    Role role;

    @Before

    public void setUp() {
        this.role = new Role.Builder().build();
        role = RoleFactory.createRole("roleDesc");

    }

    @Test
    public void createRole() {
        //Role role1 = RoleFactory.createRole("Manager");
        //Role role2 = RoleFactory.createRole("Cashier");

        Assert.assertNotNull(role);


    }

}

