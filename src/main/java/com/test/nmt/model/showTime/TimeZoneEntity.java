package com.test.nmt.model.showTime;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "timezone")
public class TimeZoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeZoneID;
    private Time startTime;
    private Time endTime;

    public TimeZoneEntity loadFromDTO(TimeZoneDTO dto) {
        this.timeZoneID = dto.getTimeZoneID();
        this.startTime = dto.getStartTime();
        this.endTime = dto.getEndTime();
        return this;
    }
}
