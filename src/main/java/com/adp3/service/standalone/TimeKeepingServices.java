/**
 * Author: Lucky  Lungisa Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Description: TimekeepingService
 */

package com.adp3.service.standalone;

import com.adp3.entity.standalone.Timekeeping;
import com.adp3.service.IService;

import java.util.Set;

public interface TimeKeepingServices  extends IService<Timekeeping,String> {
    Set<Timekeeping> getAll();

}
