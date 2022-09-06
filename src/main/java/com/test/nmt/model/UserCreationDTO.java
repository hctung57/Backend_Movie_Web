package com.test.nmt.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreationDTO implements Serializable {
    private String full_name;
    private String username;
    private String password;
    private String email;
    private long user_id;
    private Integer role;
}
