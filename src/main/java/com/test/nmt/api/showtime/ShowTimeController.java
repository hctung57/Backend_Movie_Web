package com.test.nmt.api.showtime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.showTime.ShowTimeDTO;
import com.test.nmt.service.showTime.ShowTimeService;

@RestController
@RequestMapping("/api/showtime")
public class ShowTimeController {
    @Autowired
    ShowTimeService showTimeService;

    @PostMapping
    public void createShowTime(@RequestBody ShowTimeDTO showTimeDTO) {
        showTimeService.createShowTime(showTimeDTO);
    }
}
