package com.adp3.service.demography;

import com.adp3.entity.standalone.Role;
import com.adp3.service.IService;

import java.util.Set;

public interface RoleService extends IService<Role,String>  {
    Set<Role> getAll();

    Set<Role> getAllstartingWithS();
}
