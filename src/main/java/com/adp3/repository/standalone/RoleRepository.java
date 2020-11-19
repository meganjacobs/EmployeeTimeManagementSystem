package com.adp3.repository.standalone;
import com.adp3.entity.standalone.Role;
import com.adp3.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Name: Sanele Ngwenya
   Student No.: 216019699
    Group: PT*/

import java.util.Set;
@Repository
public interface RoleRepository extends JpaRepository<Role,String> {
    //Set<Role> getAll();
}
