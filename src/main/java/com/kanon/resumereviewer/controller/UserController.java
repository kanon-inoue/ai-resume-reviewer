package com.kanon.resumereviewer.controller;

import com.kanon.resumereviewer.dto.UserResponse;
import com.kanon.resumereviewer.entity.User;
import com.kanon.resumereviewer.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.kanon.resumereviewer.dto.RegisterRequest;
import com.kanon.resumereviewer.dto.LoginRequest;
import com.kanon.resumereviewer.dto.LoginResponse;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/api/users/register")
    public UserResponse registerUser(@RequestBody RegisterRequest request) {
        return userService.registerUser(request);
    }

    @PostMapping("/api/users/login")
    public LoginResponse loginUser(@RequestBody LoginRequest request) {
        return userService.loginUser(request);
    }
}