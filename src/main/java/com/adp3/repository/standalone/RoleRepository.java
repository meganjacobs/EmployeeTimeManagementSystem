package com.adp3.repository.standalone;
import com.adp3.entity.standalone.Role;
import com.adp3.repository.IRepository;

/* Name: Sanele Ngwenya
   Student No.: 216019699
    Group: PT*/

import java.util.Set;

public interface RoleRepository extends IRepository<Role,String> {
    Set<Role> getAll();
}
