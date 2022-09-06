package com.test.nmt.model.room;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO implements Serializable {
    private Integer roomID;
    private String roomName;
    private String location;
    private Integer numberSit;
}
