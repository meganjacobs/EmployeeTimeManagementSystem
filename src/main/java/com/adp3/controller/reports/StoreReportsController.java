


package com.adp3.controller.reports;

import com.adp3.entity.reports.StoreReports;
import com.adp3.factory.reports.StoreReportFactory;
import com.adp3.service.reports.impl.StoreReportsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/race")
public class StoreReportsController {

    @Autowired
    private StoreReportsServiceImpl storeReportsService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public StoreReports create(StoreReports storeReports){
        StoreReports newStoreReports = StoreReportFactory.createStoreReports(storeReports.getReportDesc());
        return storeReportsService.create(newStoreReports);
   }
   /*

    */
   @GetMapping("/read/{storeReportsId}")
   public  StoreReports read(@PathVariable String ReportId){
       return storeReportsService.read(ReportId);
   }
   /*

    */
   @PutMapping("/update")
   public StoreReports update(@RequestBody StoreReports storeReports){
       return storeReportsService.update(storeReports);
   }
   /*

    */
   public void delete(@PathVariable String reportId){
       storeReportsService.delete(reportId);
   }

    @GetMapping("/all")
   public Set<StoreReports> getAll(){
        return storeReportsService.getAll();
   }
}
