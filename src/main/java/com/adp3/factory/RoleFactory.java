package com.adp3.Factory;

import com.adp3.entity.Role;
import com.adp3.util.GenericHelper;

public class RoleFactory {

    public Role getRole(String roleDesc){

        String roleId = GenericHelper.generateID();
        Role role = new Role.Builder()
                .setRoleID(roleId)
                .setRoleDesc(roleDesc)
                .build();

        return role;
    }
}
