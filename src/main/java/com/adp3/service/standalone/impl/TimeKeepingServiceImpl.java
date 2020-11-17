package com.adp3.service.standalone.impl;
import com.adp3.entity.standalone.Timekeeping;
import com.adp3.repository.standalone.TimekeepingRepository;
import com.adp3.service.standalone.TimeKeepingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;


@Service
public class TimeKeepingServiceImpl implements TimeKeepingServices {
@Autowired
private TimekeepingRepository timekeepingrepository;

    @Override
    public Set<Timekeeping> getAll() {
        return this.timekeepingrepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public Timekeeping create(Timekeeping t) {
        return this.timekeepingrepository.save(t);
    }

    @Override
    public Timekeeping read(String s) {
        return this.timekeepingrepository.findById(s).orElse(null);
    }

    @Override
    public Timekeeping update(Timekeeping t) {
        return this.timekeepingrepository.save(t);
    }

    @Override
    public void delete(String s) {
        this.timekeepingrepository.deleteById(s);
    }
}
