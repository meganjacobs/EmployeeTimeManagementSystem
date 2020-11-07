package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeRole;
import com.adp3.factory.bridge.EmployeeRoleFactory;
import com.adp3.service.bridge.impl.EmployeeRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employeeRole")
public class EmployeeRoleController {

    @Autowired
    private EmployeeRoleServiceImpl employeeRoleService;

    @PostMapping("/create")
    public EmployeeRole create(@RequestBody EmployeeRole employeeRole)
    { EmployeeRole employeeRole1 = EmployeeRoleFactory.createEmployeeRole(employeeRole.getEmpID(), employeeRole.getRoleID());
      return employeeRoleService.create(employeeRole);
    }

    @GetMapping("/read {empID}")
    public EmployeeRole read(@PathVariable String empID)
    {
        return employeeRoleService.read(empID);
    }

    @PutMapping("/update")
    public EmployeeRole update(EmployeeRole employeeRole)
    {
        employeeRoleService.update(employeeRole);
        return employeeRole;
    }

    @DeleteMapping("/deleting{empID}")
    public void delete(@PathVariable String empID)
    {
            employeeRoleService.delete(empID);
    }

    @GetMapping("/getAll")
    public Set<EmployeeRole> getAll()
    {
      return employeeRoleService.getAll();
    }

}
