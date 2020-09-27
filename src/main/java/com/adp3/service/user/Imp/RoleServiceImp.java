package com.adp3.service.user.Imp;

import com.adp3.entity.standalone.Role;
//import com.adp3.repository.standalone.Imp.RoleImp;
import com.adp3.repository.standalone.RoleRepository;
import com.adp3.repository.standalone.impl.RoleImp;
import com.adp3.service.user.RoleService;

/* Name: Sanele Ngwenya
        Student No.: 216019699
        Group: PT*/

public class RoleServiceImp implements RoleService {

    private static RoleRepository repository = null;
    private RoleRepository role;

    private RoleServiceImp(){ this.repository = RoleImp.getRepository(); }

    public static RoleService getService(){
        RoleServiceImp service = null;
        service = new RoleServiceImp();
        return service;
    }

    @Override
    public RoleRepository getAll() {

        return this.repository;
    }

    @Override
    public Role create(Role roleC) {
        return this.repository.create(roleC);
    }

    @Override
    public Role read(String roleR) {

        return this.repository.read(roleR);
    }

    @Override
    public Role update(Role roleD) {
        return this.repository.update(roleD);

    }

    @Override
    public void delete(String sDelete) {
        this.repository.delete(sDelete);

    }
}
