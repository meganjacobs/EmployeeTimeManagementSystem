package com.adp3.repository.standalone;
import com.adp3.entity.standalone.TimekeepingService;
import com.adp3.repository.IRepository;

import java.util.Set;

public interface  TimekeepingServiceRepository extends IRepository<TimekeepingService,String> {
Set<TimekeepingService> getAll();

}
