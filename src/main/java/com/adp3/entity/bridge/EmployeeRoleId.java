package com.adp3.entity.bridge;

import java.io.Serializable;
import java.util.Objects;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description:
 */
public class EmployeeRoleId implements Serializable {
    private  String empId,roleId;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass())
           return false;
        EmployeeRoleId that = (EmployeeRoleId) o;
        return  empId.equals(that.empId) && roleId.equals(that.roleId);
    }

    @Override
    public  int hashCode(){
        return  Objects.hash(empId,roleId);
    }

}
