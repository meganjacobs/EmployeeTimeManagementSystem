package com.adp3.service.demography.Imp;

import com.adp3.entity.standalone.Role;
import com.adp3.repository.standalone.Imp.RoleImp;
import com.adp3.repository.standalone.RoleRepository;
import com.adp3.service.demography.RoleService;

import java.util.HashSet;
import java.util.Set;

public abstract class RoleServiceImp implements RoleService {

    private static RoleService service = null;
    private static RoleRepository repository;

    private RoleServiceImp(){
        this.repository = RoleImp.getRepository();
    }

    public static RoleService getService(){
        if(service == null)service= new RoleServiceImp() {
            @Override
            public Set<Role> getAll() {
                return null;
            }

            @Override
            public Set<Role> getAllstartingWithS() {
                Set<Role>roles = getAll();
                Set<Role> rolesWithS = new HashSet<>();
                for(Role role : roles){
                    if (role.getRoleDesc().trim().toLowerCase().startsWith("s")){
                        rolesWithS.add(role);
                    }
                }
                return null;
            }

            @Override
            public Role create(Role t) {
                return null;
            }

            @Override
            public Role read(String s) {
                return null;
            }

            @Override
            public Role update(Role t) {
                return null;
            }

            @Override
            public void delete(String s) {

            }
        };
        return (RoleService) repository;
    }

}
