package com.rhinocode.urlshortener.service.user;

import com.rhinocode.urlshortener.dto.UserDTO;
import com.rhinocode.urlshortener.entity.User;

public interface IUserService {
    User createUser(UserDTO userDTO);
}
