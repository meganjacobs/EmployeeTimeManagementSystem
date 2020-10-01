package com.adp3.service.standalone;

import com.adp3.entity.standalone.Leave;
import com.adp3.service.IService;

import java.util.Set;

/**
 * Author: Ayanda Nongxa
 * desc: Leave Service extends IService
 * Class: Part Time
 * *Student number: 204513723
 */
public interface LeaveService extends IService<Leave, String> {
    Set<Leave> getAll();

}
