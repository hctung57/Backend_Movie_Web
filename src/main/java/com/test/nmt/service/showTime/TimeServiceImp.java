package com.test.nmt.service.showTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.nmt.model.showTime.TimeZoneDTO;
import com.test.nmt.repository.TimeZoneRepository;

@Service
public class TimeServiceImp implements TimeService {
    @Autowired
    private TimeZoneRepository timeZoneRepository;

    @Override
    public TimeZoneDTO getByID(Long id) {
        return new TimeZoneDTO().loadFromEntity(timeZoneRepository.findById(id).orElse(null));
    }
}
