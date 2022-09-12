package com.test.nmt.api.ticket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.ticket.TicketDTO;
import com.test.nmt.service.ticket.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public TicketDTO getTicketByTicketID(@RequestParam(name = "id") Long id) {
        return ticketService.getByTicketID(id);
    }

    @GetMapping("/user")
    public List<TicketDTO> getTicketByUserID(@RequestParam(name = "id") Long id) {
        return ticketService.getByUserID(id);
    }
}
