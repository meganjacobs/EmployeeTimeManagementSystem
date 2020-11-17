package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.RoleRepository;
import com.adp3.service.standalone.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
//import com.adp3.service.user.RoleService;

//import com.adp3.repository.standalone.Imp.RoleImp;

/* Name: Sanele Ngwenya
        Student No.: 216019699
        Group: PT*/
@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    //private static RoleRepository repository = null;
    private RoleRepository role;


//    private RoleServiceImp(){ this.repository = RoleImp.getRepository(); }
//
//    public static RoleServiceImp getService(){
//        RoleServiceImp service = null;
//        service = new RoleServiceImp();
//        return service;
//    }

    @Override
    public Set<Role> getAll() {

        return role.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Role create(Role role) {
        return this.role.save(role);
    }

    @Override
    public Role read(String s) {

        return this.role.findById(s).orElse(null);
    }

    @Override
    public Role update(Role D) {
        if (this.role.existsById(D.getRoleID())) {
            return this.role.save(D);
        }
        return null;

    }

    @Override
    public void delete(String sDelete) {
        this.role.delete(role.getOne(sDelete));
    }
}