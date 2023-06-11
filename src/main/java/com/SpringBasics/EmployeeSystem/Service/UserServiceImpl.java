package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.ProjectDto;
import com.SpringBasics.EmployeeSystem.DTO.UserDto;

import com.SpringBasics.EmployeeSystem.DataAccess.ProjectRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.RoleRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.UserRepository;

import com.SpringBasics.EmployeeSystem.Entities.Project;
import com.SpringBasics.EmployeeSystem.Entities.Role;
import com.SpringBasics.EmployeeSystem.Entities.User;
//import com.SpringBasics.EmployeeSystem.Entities.UserPrincipal;
import com.SpringBasics.EmployeeSystem.Exception.UserNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        User user=this.modelMapper.map(userDto,User.class);

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return userDto;

    }

    @Override
    public void deleteUser(long id) {
        User user=userRepository.findById(id).orElseThrow(()->new UserNotFoundException("Not found"));
        userRepository.delete(user);
    }

    @Override
    public UserDto updateUser(UserDto userDto, long id) {

        User user=userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found"));
        modelMapper.map(userDto, user);
        userRepository.save(user);
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public ProjectDto assignProject(ProjectDto projectDto, long id) {
        User user=userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found"));

        Project project=this.modelMapper.map(projectDto, Project.class);
        projectRepository.save(project);

        System.out.println(user.getUsername());

            if (user.getProjects().isEmpty()) {

                List<Project> projects = new ArrayList<Project>(Arrays.asList(project));
                     user.setProjects(projects);
                     userRepository.save(user);
            }

        return modelMapper.map(project, ProjectDto.class);
    }

    @Override
    public List<User> findAllUsers() {
        List<User> userList=userRepository.findAll();

        return userList;
    }


}
