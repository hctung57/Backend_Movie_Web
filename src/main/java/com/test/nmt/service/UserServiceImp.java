package com.test.nmt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.nmt.model.User;
import com.test.nmt.model.UserCreationDTO;
import com.test.nmt.model.UserDTO;
import com.test.nmt.model.UserMapper;
import com.test.nmt.repository.UserRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO create(UserCreationDTO dto) {
        User user = UserMapper.getInstance().toEntity(dto);
        return UserMapper.getInstance().toDTO(userRepository.save(user));
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(user -> UserMapper.getInstance().toDTO(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(Long id) {
        return userRepository.findById(id)
                .map(user -> UserMapper.getInstance().toDTO(user))
                .orElse(null);
    }
}
