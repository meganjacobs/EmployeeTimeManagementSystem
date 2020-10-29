/**
 * Author: Lucky  Lungisa Mkhasakhasa
 * Class: Part Time
 * Student number: 216060117
 * Description: TimekeepingServiceRepository - extends member methods of parent "IRepository"
 */
package com.adp3.repository.standalone;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.repository.IRepository;

import java.util.Set;

public interface  TimekeepingRepository extends IRepository<Timekeeping,String> {
Set<Timekeeping> getAll();

}
