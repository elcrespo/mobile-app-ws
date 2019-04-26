package com.example.mobileappws.com.example.mobileappws.service;

import com.example.mobileappws.com.example.mobileappws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUsuer(String email);
}
