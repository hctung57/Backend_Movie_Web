package com.test.nmt.service.oderRequest;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.nmt.model.ticket.TicketDetailDTO;

@Service
public interface OderTicketRequestService {
    public TicketDetailDTO getTicketDetailByTicketID(Long id);

    // public List<TicketDetailDTO> getTicketDetailByUserID(Long id);
}
