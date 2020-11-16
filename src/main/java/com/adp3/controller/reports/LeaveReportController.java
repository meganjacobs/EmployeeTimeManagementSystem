package com.adp3.controller.reports;

import com.adp3.entity.bridge.EmployeeLeave;
import com.adp3.entity.bridge.EmployeeStore;
import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
import com.adp3.service.bridge.impl.EmpLeaveServiceImpl;
import com.adp3.service.bridge.impl.EmployeeStoreServiceImpl;
import com.adp3.service.reports.impl.LeaveReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Controller:
 * 1. LeaveReportController - all requests that have /leaveReport appended to it, direct to this class.
 * 2. Exposes the methods within the LeaveReportService
 */


@RestController
@RequestMapping ("employee_time_management/leaveReport")
public class LeaveReportController {

    //access to LeaveReportService bean using Spring autowired annotation
    @Autowired
    private LeaveReportServiceImpl leaveReportService;
    //creates EmployeeLeaveService bean using Spring autowired annotation
    @Autowired
    private EmpLeaveServiceImpl employeeLeaveService;
    //creates EmployeeStoreService bean using Spring autowired annotation
    @Autowired
    private EmployeeStoreServiceImpl employeeStoreService;

    /* exposes method used to create a new LeaveReport
     * @param: leaveReportDesc - eg. Annual Leave, Sick Leave etc
     * @return: LeaveReport
     * */
    @PostMapping ("/create")
    public LeaveReport create(@RequestBody LeaveReport leaveReport){
        boolean employeeLeaveExists = false;
        boolean employeeStoreExists = false;

        EmployeeLeave employeeLeave = null;
        try {
            employeeLeave = employeeLeaveService.read(leaveReport.getEmpID());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (employeeLeave != null) {
            employeeLeaveExists = true;
        }
        EmployeeStore employeeStore = null;
        try {
            employeeStore = employeeStoreService.read(leaveReport.getStoreID());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (employeeStore != null) {
            employeeStoreExists = true;
        }

        if (employeeLeaveExists && employeeStoreExists) {
            leaveReportService.create(leaveReport);
            return leaveReport;
        }

        else return null;
    }

    /* exposes method used to read a LeaveReport
     * @param: leaveReportID - eg. record 001, record 231 etc
     * @return: LeaveReport
     * */
    @GetMapping ("/read/{leaveReportID}")
    public LeaveReport read(@PathVariable String leaveReportID) {
        return leaveReportService.read(leaveReportID);
    }

    /* exposes method used to update a LeaveReport
     * @param: leaveReport
     * @return: LeaveReport
     * */
    @PutMapping ("/update")
    public LeaveReport update(@RequestBody LeaveReport leaveReport) {
        return leaveReportService.update(leaveReport);
    }

    /* exposes method used to delete a LeaveReport
     * @param: leaveReportID - eg. record 001, record 231 etc
     * @return: void
     * */
    @DeleteMapping ("/delete/{leaveReportID}")
    public void delete(@PathVariable String leaveReportID) {
        leaveReportService.delete(leaveReportID);
    }

    /* exposes method used to retrieve Collection of LeaveReport
     * @param: void
     * @return: Set
     * */
    @GetMapping ("/getAll")
    public Set<LeaveReport> getAll() {
        return leaveReportService.getAll().stream().collect(Collectors.toSet());
    }

}
