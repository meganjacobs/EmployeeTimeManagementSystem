package com.adp3.service.standalone;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.RoleRepository;
import com.adp3.service.IService;

/* Name: Sanele Ngwenya
   Student No.: 216019699
    Group: PT*/

public interface RoleService extends IService<Role,String> {
    static RoleRepository getAll();
}
