package com.adp3.service.standalone.impl;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.RoleRepository;
import com.adp3.repository.standalone.impl.RoleImp;

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
    private static RoleRepository repository = null;
    private RoleRepository role;

    private RoleServiceImp(){ this.repository = RoleImp.getRepository(); }

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
    public Role create(Role roleC) {
        return this.role.save(role);
    }

    @Override
    public Role read(String roleR) {

        return this.role.findById(s).orElse(null);
    }

    @Override
    public Role update(Role d) {
        return this.role.delete(d);

    }

    @Override
    public void delete(String s) {
        this.role.deleteById(s);

    }
}
