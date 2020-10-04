package com.adp3.controller.standalone;
/**
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Controller:  TimekeepingServiceController
 * */
import com.adp3.service.standalone.TimeKeepingServices;
import com.adp3.service.standalone.impl.TimeKeepingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;

@RestController
@RequestMapping("/Timekeeping")
public class TimekeepingController {
    @Autowired
   //@Qualifier("TimekeepingServiceImp")
    private TimeKeepingServiceImpl  TimeKeepingServices;
    @GetMapping("/read/all")
    @ResponseBody
    public Set<TimeKeepingServices> getAll() {
        return TimeKeepingServices.getAll();
    }
    @PostMapping
    public TimeKeepingServices create(@RequestBody TimeKeepingServices timekeepingservices) {
      //  TimeKeepingServices newTimekeepingservices = TimekeepingFactory.buildTimekeepingService(1,1,"");
        return TimeKeepingServices.create(timekeepingservices);
    }

    public TimeKeepingServices read(String s) {
        return TimeKeepingServices.read(s);
    }

    public TimeKeepingServices update(TimeKeepingServices t) {
        return TimeKeepingServices.update(t);
    }
    @DeleteMapping ("/delete/{Primary-Key}")
    public void delete(String s) {
        TimeKeepingServices.delete(s);
    }
}
