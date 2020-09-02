package com.adp3.repository.standalone;
import com.adp3.entity.standalone.Role;
import com.adp3.repository.IRepository;

import java.util.Set;

public interface RoleRepository extends IRepository<Role,String> {
    Set<Role> getAll();
}
