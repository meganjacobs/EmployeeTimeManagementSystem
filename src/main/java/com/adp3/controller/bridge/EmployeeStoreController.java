package com.adp3.controller.bridge;

import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.entity.standalone.Employee;     // calling employee.java
import com.adp3.entity.standalone.Store;       // calling store.java
import com.adp3.factory.bridge.EmployeeStoreFactory;
import com.adp3.service.bridge.impl.EmployeeStoreServiceImpl;
import com.adp3.service.standalone.impl.EmployeeServiceImpl;
import com.adp3.service.standalone.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Author: Munyaradzi Manyati
 * Class: Part Time
 * Student number: 215211855
 * Class Description: EmployeeStoreController
 */


@RestController
@RequestMapping("/employeestore")
public class EmployeeStoreController {

    @MockBean
    private EmployeeStoreServiceImpl empStoreService;

    @Autowired
    private EmployeeServiceImpl employeeService;

    @Autowired
    private StoreServiceImpl storeService;

    @PostMapping("/create")
    public EmployeeStore create(@RequestBody EmployeeStore employeeStore) {
        boolean employeeExist = false;
        boolean storeExist = false;

        Employee employee = employeeService.read(employeeStore.getEmpID());   //calling employee.java
        if (employee != null) {
            employeeExist = true;
        }
        Store store = storeService.read(employeeStore.getStoreID());       //calling store.java
        if (store != null) {
            storeExist = true;
        }

        if (employeeExist && storeExist)
            return empStoreService.create(employeeStore);
        else return EmployeeStoreFactory.createEmployeeStore("", "");
    }

    @GetMapping("/read{id}")
    public EmployeeStore read(@PathVariable String id) {
        return empStoreService.read(id);
    }

    @PostMapping("/update")
    public EmployeeStore update(@RequestBody EmployeeStore employeeStore) {
        return empStoreService.update(employeeStore);
    }

    @GetMapping("/getall")
    public Set<EmployeeStore> getAll() {
        return empStoreService.getAll();
    }

    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable String id) {
         this.empStoreService.delete(id);
    }

}