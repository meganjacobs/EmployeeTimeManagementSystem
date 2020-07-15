package com.adp3.factory;

import com.adp3.Factory.RoleFactory;
import com.adp3.entity.Role;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

  /*Sanele Ngwenya
216019699
part time
 */

import static org.junit.Assert.*;

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

