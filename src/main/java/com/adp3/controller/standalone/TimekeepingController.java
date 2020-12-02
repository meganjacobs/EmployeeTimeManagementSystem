package com.adp3.controller.standalone;
/**
 * Author: Lungisa Lucky Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Controller:  TimekeepingServiceController
 * */
import com.adp3.entity.standalone.Employee;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.factory.standalone.TimekeepingFactory;
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
    private TimeKeepingServices  timekeepingservices;
    @PostMapping("/create")
    public Timekeeping create(@RequestBody Timekeeping Timekeeping )
    {
        Timekeeping timekeeping = TimekeepingFactory.buildTimekeepingService(Timekeeping.getTime_In(),Timekeeping.getTime_Out(),Timekeeping.getempID());
        return timekeepingservices.create(timekeeping);
    }

    @GetMapping("/read/{id}")
    public Timekeeping read(@PathVariable String id)
    {
        return timekeepingservices.read(id);
    }

    @PutMapping("/update/{id}")
    public Timekeeping update(@RequestBody Timekeeping timekeeping) {

        return timekeepingservices.update(timekeeping);
    }

    @DeleteMapping("delete/{id}")
     void delete(@PathVariable String id) {
         timekeepingservices.delete(id);}

         @GetMapping("/all")
         public Set<Timekeeping> getAll() {
            return timekeepingservices.getAll();
        }
}
