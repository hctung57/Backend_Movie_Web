package com.test.nmt.model.scheduleRequest;

import java.sql.Date;
import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class scheduleRequestDTO {
    private Long movieID;
    private String movieName;
    private String description;
    private String banner_url;
    private Long showTimeID;
    private String roomName;
    private String location;
    private Integer numberSit;
    private Long numTicketSold;
    private Date showDate;
    private Long timeZoneID;
    private Time startTime;
    private Time endTime;
}
