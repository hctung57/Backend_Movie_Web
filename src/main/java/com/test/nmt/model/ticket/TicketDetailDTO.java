package com.test.nmt.model.ticket;

import com.test.nmt.model.UserDTO;
import com.test.nmt.model.scheduleRequest.MovieScheduleRequestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDetailDTO {
    private Long ticketID;
    private UserDTO userDTO;
    private MovieScheduleRequestDTO showTimeDTO;

}
