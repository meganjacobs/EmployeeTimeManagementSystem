package com.adp3.controller.standalone;

//import com.adp3.entity.standalone.Employee;
import com.adp3.entity.standalone.Role;
import com.adp3.factory.standalone.RoleFactory;
//import com.adp3.service.demography.Imp.RoleServiceImp;
import com.adp3.service.standalone.RoleService;
import com.adp3.service.standalone.impl.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


/* Name: Sanele Ngwenya
   Student No.: 216019699
    Group: PT*/


@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleServiceImp roleService;

    @PostMapping("/create")
    public Role create(@RequestBody Role role) {
        Role newRole = RoleFactory.createRole(role.getRoleDesc());
        return roleService.create (newRole );
    }

    @GetMapping("/read/{roleID}")
    public Role read(@PathVariable String roleID) {
        return roleService.read(roleID);
    }

    @PutMapping ("/update/{id}")
    public Role update(@RequestBody Role role) {
        return roleService.update(role);
    }

    @GetMapping("/all")
    public Set<Role> getAll() { return roleService.getAll();
    }

    @DeleteMapping ("/delete/{roleID}")
    public void delete(@PathVariable String roleID) {
        roleService.delete(roleID);
    }


}
