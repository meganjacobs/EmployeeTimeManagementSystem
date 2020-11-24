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
    private RoleRepository repository;
    private RoleRepository role;

    @Override
    public Set<Role> getAll() {

        return role.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Role create(Role role) {
        return this.repository.save(role);
    }

    @Override
    public Role read(String roleR) {

        return this.role.findById(roleR).orElse(null);
    }

    @Override
    public Role update(Role d) {
        return this.repository.save(d);

    }

    @Override
    public void delete(String s) {
        this.role.deleteById(s);

    }
}

