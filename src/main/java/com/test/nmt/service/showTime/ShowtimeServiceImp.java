package com.test.nmt.service.showTime;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.nmt.model.showTime.ShowTimeDTO;
import com.test.nmt.repository.ShowTimeRepository;

@Service
public class ShowtimeServiceImp implements ShowTimeService {
    @Autowired
    private ShowTimeRepository showTimeRepository;

    @Override
    public ShowTimeDTO getByID(Long id) {
        return new ShowTimeDTO().loadFromEntity(showTimeRepository.findById(id).orElse(null));
    }

    @Override
    public List<ShowTimeDTO> getAll() {
        return showTimeRepository.findAll().stream().map(show -> new ShowTimeDTO().loadFromEntity(show))
                .collect(Collectors.toList());
    }
}
