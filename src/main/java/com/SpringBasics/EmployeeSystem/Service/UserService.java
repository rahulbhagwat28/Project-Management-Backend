package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.ProjectDto;
import com.SpringBasics.EmployeeSystem.DTO.UserDto;

import com.SpringBasics.EmployeeSystem.Entities.Project;
import com.SpringBasics.EmployeeSystem.Entities.User;

import java.security.Principal;
import java.util.List;


//All service endpoint methods
public interface UserService {

    UserDto createUser(UserDto employeeDto);

    void deleteUser(long id);

    UserDto updateUser(UserDto employeeDto, long id);

    ProjectDto assignProject(ProjectDto projectDto, long userId);

    void completeProject(long projectId,String username);

    List<User> findAllUsers();

    List<Project> getCompletedProjects();

}
