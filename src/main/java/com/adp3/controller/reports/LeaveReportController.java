package com.adp3.controller.reports;

import com.adp3.entity.reports.LeaveReport;
import com.adp3.service.reports.impl.LeaveReportServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/leaveReport")
public class LeaveReportController {

    @Autowired
    private LeaveReportServiceImpl leaveReportService;

    @PostMapping ("/create")
    public LeaveReport create(LeaveReport leaveReport){
        return leaveReport;
    }
}
