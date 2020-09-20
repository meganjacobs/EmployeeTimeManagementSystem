package com.adp3.controller.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.factory.reports.LeaveReportFactory;
import com.adp3.service.reports.impl.LeaveReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Author: Megan Jacobs
 * Class: Part Time
 * Student number: 211137162
 * Controller:
 * 1. LeaveReportController - all requests that have /leaveReport appended to it, direct to this class.
 * 2. Exposes the methods within the LeaveReportService
 */


@RestController
@RequestMapping ("/leaveReport")
public class LeaveReportController {

    //access to LeaveReportService bean using Spring autowired annotation
    @Autowired
    private LeaveReportServiceImpl leaveReportService;

    /* exposes method used to create a new LeaveReport
     * @param: leaveReportDesc - eg. Annual Leave, Sick Leave etc
     * @return: LeaveReport
     * */
    @PostMapping ("/create")
    public LeaveReport create(@RequestBody LeaveReport leaveReport){
        LeaveReport newLeaveReport = LeaveReportFactory.buildLeaveReport(leaveReport.getLeaveReportDesc());
        return leaveReportService.create(newLeaveReport);
    }

    /* exposes method used to read a LeaveReport
     * @param: leaveReportID - eg. record 001, record 231 etc
     * @return: LeaveReport
     * */
    @GetMapping ("/read/{id}")
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
    @GetMapping ("/delete/{id}")
    public void delete(@PathVariable String id) {
        leaveReportService.delete(id);
    }

    /*method used to retrieve Collection of LeaveReport
     * @param: void
     * @return: Set
     * */
    @GetMapping ("/getAll")
    public Set<LeaveReport> getAll() {
        return leaveReportService.getAll();
    }

}
