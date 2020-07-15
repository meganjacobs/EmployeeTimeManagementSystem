package com.adp3.Factory;


import com.adp3.entity.Role;
import com.adp3.util.GenericHelper;

/*Sanele Ngwenya
216019699
part time
 */



public class RoleFactory {
    //private RoleFactory(){
    //}

    public static Role createRole(String roleDesc){

        String roleId = GenericHelper.generateID();
        return new Role.Builder()
                .setRoleID(roleId)
                .setRoleDesc(roleDesc)
                .build();


    }


    //public static Role createRole(String cashier) {
    //    return null;
    //}
}