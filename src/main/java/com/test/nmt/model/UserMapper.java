package com.test.nmt.model;

public class UserMapper {
    private static UserMapper INSTANCE;

    public static UserMapper getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new UserMapper();
        }
        return INSTANCE;
    }

    public User toEntity(UserCreationDTO dto) {
        User user = new User();
        user.setFull_name(dto.getFull_name());
        user.setUsername(dto.getUsername());
        user.setUser_id(dto.getUser_id());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return user;
    }

    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setFull_name(user.getFull_name());
        dto.setEmail(user.getEmail());
        dto.setUser_id(user.getUser_id());
        dto.setUsername(user.getUsername());
        dto.setRole(user.getRole());
        return dto;
    }

}
