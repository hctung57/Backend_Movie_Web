package com.test.nmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.nmt.model.UserCreationDTO;
import com.test.nmt.model.UserDTO;

@Service
public interface UserService {
    public List<UserDTO> findAll();

    public UserDTO create(UserCreationDTO dto);

    public UserDTO findById(Long id);
}
