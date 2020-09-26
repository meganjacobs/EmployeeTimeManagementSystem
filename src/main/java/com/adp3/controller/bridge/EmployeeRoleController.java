package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.service.bridge.impl.EmployeeRoleServiceImpl;

import java.util.Set;

@RestController
@RequestMapping("/EmployeeRole")
public class EmployeeRoleController {

    @Autowired
    private EmployeeRoleServiceImpl employeeRoleService;

    @PostMapping("/create")
    public EmployeeRole create(@RequestBody EmployeeRole employeeRole)
    { EmployeeRole employeeRole1 = EmployeeRoleFactory.createEmployeeRole(employeeRole.getEmpID(), employeeRole.getRoleID())
      return employeeRoleService.create(employeeRole1);
    }

    @GetMapping("/read {employeeRoleId")
    public EmployeeRole read(@PathVariable String employeeRole){
        return employeeRoleService.read(employeeRole);
    }
    @PutMapping("/update")
    public EmployeeRole update(EmployeeRole employeeRole) {
        employeeRoleService.update(employeeRole);
        return employeeRole;
    }
    @DeleteMapping(@PathVariable"/deleting{employeeRoleId")
        public void delete(String employeeRoleId){
            employeeRoleService.delete(employeeRoleId);
    }

    @GetMapping("/getAll")
    public Set<EmployeeRole> getAll()
    {
      return employeeRoleService.getAll();
    }

}
