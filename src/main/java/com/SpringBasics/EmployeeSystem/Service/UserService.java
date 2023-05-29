package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.UserDto;

import com.SpringBasics.EmployeeSystem.Entities.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto employeeDto);

    void deleteUser(long id);

    UserDto updateUser(UserDto employeeDto, long id);


    List<User> findAllUsers();

}