package com.net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.net.javaguides.springboot.model.User;
import com.net.javaguides.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
