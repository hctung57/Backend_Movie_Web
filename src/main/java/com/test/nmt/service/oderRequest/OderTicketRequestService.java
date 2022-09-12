package com.test.nmt.service.oderRequest;

import org.springframework.stereotype.Service;

import com.test.nmt.model.ticket.TicketDetailDTO;

@Service
public interface OderTicketRequestService {
    public TicketDetailDTO getTicketDetailByTicketID(Long id);

    public TicketDetailDTO getTicketDetailByUserID(Long id);
}
