package com.user.microservices.Micro_Usersdetails.service;

import com.user.microservices.Micro_Usersdetails.DTO.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

// This interface defines the contract for user-related services in the microservice architecture.
@Component
public interface IUserService {
    // Method to get user details by ID
    UserDto getUserById(Long id);

    // Method to create a new user
    UserDto createUser(UserDto userDto);

    // Method to update an existing user
    UserDto updateUser(Long id, UserDto userDto);

    // Method to delete a user by ID
    void deleteUser(Long id);

    List<UserDto> getAllUsers();
}
