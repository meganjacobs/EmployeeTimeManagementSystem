package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Leave;
import com.adp3.factory.standalone.LeaveFactory;
import com.adp3.service.standalone.impl.LeaveServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Author: Ayanda Nongxa
 * desc: Leave Service Implementation
 * Class: Part Time
 * *Student number: 204513723
 */
@RequestMapping ("/leave")
@RestController
public class LeaveController {
    @Autowired
    private LeaveServiceImpl leaveService;

    @PostMapping("/create")
    public Leave create(@RequestBody Leave leave){
        Leave newLeave = LeaveFactory.createLeave(leave.getLeaveDescription());
        return leaveService.create(newLeave);
    }

    @GetMapping("/read/{leaveID}")
    public Leave read(@PathVariable String leaveID){return leaveService.read(leaveID);}

    @PatchMapping("/update/{id}")
    public Leave update(@RequestBody Leave leave){return leaveService.update(leave);}

    @DeleteMapping("/delete/{leaveID}")
    public void delete(@PathVariable String leaveID){ leaveService.delete(leaveID);}

    @GetMapping("/all")
    public Set<Leave> getAll(){return leaveService.getAll();}

}