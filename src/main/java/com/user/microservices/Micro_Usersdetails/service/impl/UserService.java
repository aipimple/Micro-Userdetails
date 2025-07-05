package com.user.microservices.Micro_Usersdetails.service.impl;

import com.user.microservices.Micro_Usersdetails.DTO.UserDto;
import com.user.microservices.Micro_Usersdetails.entity.Users;
import com.user.microservices.Micro_Usersdetails.repository.UserRepo;
import com.user.microservices.Micro_Usersdetails.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo userRepository; // Assuming you have a UserRepository for database operations

    @Override
    public UserDto getUserById(Long id) {
        Users user = userRepository.findById(id).get();

        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setUserName(user.getUserName());
        userDto.setName(user.getName());
        userDto.setManagerName(user.getManagerName());
        userDto.setActive(user.isActive());
        userDto.setSysCreatedBy(user.getSysCreatedBy());
        userDto.setSysCreatedOn(user.getSysCreatedOn());
        userDto.setSysUpdatedOn(user.getSysUpdatedOn());
        userDto.setDepartmentBusinessUnit(user.getDepartmentBusinessUnit());
        userDto.setEmail(user.getEmail());

        return userDto; // Convert Users entity to UserDto and return
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        // Logic to create a new user
        return null; // Placeholder return statement
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        // Logic to update an existing user
        return null; // Placeholder return statement
    }

    @Override
    public void deleteUser(Long id) {
        // Logic to delete a user by ID
    }

    @Override
    public List<UserDto> getAllUsers() {

        List<UserDto>   userDtoList = new ArrayList<>(); // Initialize an empty list to hold UserDto objects
        List<Users> userList = userRepository.findAll();
        if (userList == null || userList.isEmpty()) {
            return Collections.emptyList(); // Return an empty list if no users found
        }
for(Users user : userList) {
    UserDto userDto = new UserDto();
    userDto.setUserId(user.getUserId());
    userDto.setFirstName(user.getFirstName());
    userDto.setLastName(user.getLastName());
    userDto.setUserName(user.getUserName());
    userDto.setName(user.getName());
    userDto.setManagerName(user.getManagerName());
    userDto.setActive(user.isActive());
    userDto.setSysCreatedBy(user.getSysCreatedBy());
    userDto.setSysCreatedOn(user.getSysCreatedOn());
    userDto.setSysUpdatedOn(user.getSysUpdatedOn());
    userDto.setDepartmentBusinessUnit(user.getDepartmentBusinessUnit());
    userDto.setEmail(user.getEmail());
    userDtoList.add(userDto); // Add the UserDto to the list
}


        return userDtoList;
    }

}
