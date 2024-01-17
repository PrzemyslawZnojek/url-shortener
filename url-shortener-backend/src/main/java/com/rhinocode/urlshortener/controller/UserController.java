package com.rhinocode.urlshortener.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhinocode.urlshortener.dto.UserDTO;
import com.rhinocode.urlshortener.entity.User;
import com.rhinocode.urlshortener.service.user.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-user")
    public ResponseEntity<User> createUser(@RequestBody UserDTO userDTO) {
        User newUser = userService.createUser(userDTO); 
        return ResponseEntity.ok().body(newUser);
    }
}
