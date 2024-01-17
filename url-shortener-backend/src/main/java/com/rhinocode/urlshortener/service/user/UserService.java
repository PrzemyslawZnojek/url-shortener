package com.rhinocode.urlshortener.service.user;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.rhinocode.urlshortener.dto.UserDTO;
import com.rhinocode.urlshortener.entity.User;
import com.rhinocode.urlshortener.repository.IUserRepository;

@Service
public class UserService implements IUserService{

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserDTO userDTO) {
        User user = new User(userDTO.email(), userDTO.password(), Instant.now(), Instant.now());
        return userRepository.insert(user);
    }
}
