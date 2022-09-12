package com.test.nmt.service.oderRequest;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.nmt.model.ticket.TicketDTO;
import com.test.nmt.model.ticket.TicketDetailDTO;
import com.test.nmt.service.UserService;
import com.test.nmt.service.scheduleRequest.ScheduleRequestService;
import com.test.nmt.service.ticket.TicketService;

@Service
public class OderTicketRequestServiceImp implements OderTicketRequestService {
    @Autowired
    private UserService userService;
    @Autowired
    private TicketService ticketService;
    @Autowired
    private ScheduleRequestService scheduleRequestService;

    @Override
    public TicketDetailDTO getTicketDetailByTicketID(Long id) {
        TicketDTO ticketDTO = ticketService.getByTicketID(id);
        TicketDetailDTO dto = new TicketDetailDTO();
        dto.setShowTimeDTO(Arrays.asList(scheduleRequestService.getDataByShowTimeID(ticketDTO.getShowTimeID())));
        dto.setUserDTO(userService.findById(ticketDTO.getUserID()));
        dto.setTicketID(id);
        return dto;
    }

    @Override
    public TicketDetailDTO getTicketDetailByUserID(Long id) {
        TicketDetailDTO dto = new TicketDetailDTO();
        dto.setUserDTO(userService.findById(id));
        dto.setShowTimeDTO(
                ticketService.getByUserID(id).stream()
                        .map(value -> scheduleRequestService.getDataByShowTimeID(value.getShowTimeID()))
                        .collect(Collectors.toList()));
        return dto;
    }
}
