package com.test.nmt.api.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.ticket.TicketDetailDTO;
import com.test.nmt.service.oderRequest.OderTicketRequestService;

@RestController
@RequestMapping("/api/oder")
public class OderTicketController {
    @Autowired
    private OderTicketRequestService oderTicketRequestService;

    @GetMapping
    public TicketDetailDTO getTicketByTicketID(@RequestParam(name = "id") Long id) {
        return oderTicketRequestService.getTicketDetailByTicketID(id);
    }

}
