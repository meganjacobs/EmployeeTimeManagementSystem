package com.adp3.service.standalone;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.RoleRepository;
import com.adp3.service.IService;

import java.util.Set;

public interface RoleService extends IService<Role,String> {
    Set<Role> getAll();
}
