package com.test.nmt.service.showTime;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.nmt.model.showTime.ShowTimeDTO;

@Service
public interface ShowTimeService {
    public ShowTimeDTO getByID(Long id);

    public List<ShowTimeDTO> getAll();
}