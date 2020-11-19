package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.RoleRepository;

public interface RoleService {
    RoleRepository getAll();

    Role create(Role roleC);

    Role read(String roleR);

    Role update(Role roleD);

    void delete(String sDelete);
}
