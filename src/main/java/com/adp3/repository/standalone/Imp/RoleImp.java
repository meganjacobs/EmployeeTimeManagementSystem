package com.adp3.repository.standalone.Imp;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.RoleRepository;

import java.util.HashSet;
import java.util.Set;

/* Name: Sanele Ngwenya
   Student No.: 216019699
    Group: PT*/



public class RoleImp implements RoleRepository {

    private static RoleImp repository= null;
    private Set<Role> role;

    private RoleImp(){
    this.role = new HashSet<>();
}
    public static RoleRepository getRepository(){
        if(repository == null)repository = new RoleImp();
        return repository;
    }


    public Set<Role> getAll() {
        return this.role;
    }


    public Role create(Role roleC) {
        this.role.add(roleC);
        return roleC;
    }


    public Role read(String roleR) {

        return this.read(roleR);
    }


    public Role update(Role roleD) {
      this.role.add(roleD);
      this.role.remove(roleD);
      return roleD;

    }


    public void delete(String sDelete) {
    this.role.remove(sDelete);

    }



}
