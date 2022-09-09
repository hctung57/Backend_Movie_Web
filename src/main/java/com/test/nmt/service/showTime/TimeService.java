package com.test.nmt.service.showTime;

import org.springframework.stereotype.Service;

import com.test.nmt.model.showTime.TimeZoneDTO;

@Service
public interface TimeService {
    public TimeZoneDTO getByID(Long id);
}
