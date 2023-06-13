package com.SpringBasics.EmployeeSystem.Service.Impl;

import com.SpringBasics.EmployeeSystem.DTO.ProjectDto;
import com.SpringBasics.EmployeeSystem.DTO.UserDto;

import com.SpringBasics.EmployeeSystem.DataAccess.ProjectRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.RoleRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.UserRepository;

import com.SpringBasics.EmployeeSystem.Entities.Project;
import com.SpringBasics.EmployeeSystem.Entities.Role;
import com.SpringBasics.EmployeeSystem.Entities.User;

import com.SpringBasics.EmployeeSystem.Exception.ProjectCompletedException;
import com.SpringBasics.EmployeeSystem.Exception.ProjectNotFoundException;
import com.SpringBasics.EmployeeSystem.Exception.UserNotFoundException;

import com.SpringBasics.EmployeeSystem.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Service Implementations for all endpoints
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = this.modelMapper.map(userDto, User.class);

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        List<Role> roles=roleRepository.findAll().stream().filter(role->role.getRole_name()=="ROLE_EMPLOYEE").collect(Collectors.toList());
        user.setRoles(roles);
        userRepository.save(user);
        return userDto;

    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Not found"));
        userRepository.delete(user);
    }

    @Override
    public UserDto updateUser(UserDto userDto, long id) {

        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));
        modelMapper.map(userDto, user);
        userRepository.save(user);
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public ProjectDto assignProject(ProjectDto projectDto, long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));

        Project project = this.modelMapper.map(projectDto, Project.class);
        projectRepository.save(project);

        List<Project> projects;


        System.out.println(user.getUsername());

        if (!user.getProjects().isEmpty()) {
            projects = user.getProjects();

        } else {
            projects = new ArrayList<Project>();
        }

        projects.add(project);

        user.setProjects(projects);

        userRepository.save(user);


        return modelMapper.map(project, ProjectDto.class);
    }

    @Override
    public void completeProject(long projectId, String username) {

        User user = userRepository.findByEmail(username);

        Project projectresult = projectRepository.findById(projectId).orElseThrow(() -> new ProjectNotFoundException("Project Not Found"));

        if (user.getProjects().contains(projectresult)) {
            
            System.out.println(user.getProjects().contains(projectresult));
            if (projectresult.isCompleted() == false) {
                projectresult.setCompleted(true);
                userRepository.save(user);
            } else {
                throw new ProjectCompletedException("already completed this");
            }
        }
        else
        {
            throw new ProjectNotFoundException("User does not have this project assigned");
        }


        System.out.println(user);
    }



    @Override
    public List<User> findAllUsers() {
        List<User> userList = userRepository.findAll();

        return userList;
    }

    @Override
    public List<Project> getCompletedProjects() {

        List<Project> completedProjects=projectRepository.findAll();

        System.out.println(completedProjects.stream().filter(project->project.isCompleted()).collect(Collectors.toList()).get(0));
        return completedProjects.stream().filter(project->project.isCompleted()).collect(Collectors.toList());
    }


}
