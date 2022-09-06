package com.test.nmt.model.showTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShowTimeDTO {
    private Long showTimeID;
    private Long movieID;
    private Long roomID;
    private Long numTicketSold;
    private String showDate;
    private String timeZoneID;
}
