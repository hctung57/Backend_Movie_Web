package com.test.nmt.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.nmt.model.user.User;
import com.test.nmt.model.user.UserDTO;
import com.test.nmt.service.user.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    // @PostMapping
    // public UserDTO create(@RequestBody UserCreationDTO dto) {
    // return userService.create(dto);
    // }

    // @GetMapping
    // public List<UserDTO> findAll() {
    // return userService.findAll();
    // }

    @GetMapping("{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.getByID(id);
    }
}