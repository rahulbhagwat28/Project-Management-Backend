package com.SpringBasics.EmployeeSystem.Controllers;


import com.SpringBasics.EmployeeSystem.Constants.Constants;
import com.SpringBasics.EmployeeSystem.DTO.ProjectDto;
import com.SpringBasics.EmployeeSystem.DTO.UserDto;

import com.SpringBasics.EmployeeSystem.DataAccess.RoleRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.UserRepository;
import com.SpringBasics.EmployeeSystem.Entities.User;
//import com.SpringBasics.EmployeeSystem.Entities.UserPrincipal;
import com.SpringBasics.EmployeeSystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PostAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController

@RequestMapping("/api/v1/employees")
public class UserController {

    private UserService userService;


    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<String> createEmployee(@RequestBody @Valid UserDto userDto) {


        System.out.println(userDto.getDesignation());
        UserDto userResponse = userService.createUser(userDto);
        return new ResponseEntity<>(Constants.createSuccess, HttpStatus.OK);

    }


    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<UserDto> updateEmployee(@RequestBody UserDto userDto, @PathVariable("id") long id) {

        UserDto userResponse = userService.updateUser(userDto, id);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(Constants.deleteSuccess, HttpStatus.OK);
    }


    @GetMapping("findAllEmployees")
    public ResponseEntity<List<User>> findAllEmployees() {
        List<User> response = userService.findAllUsers();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }


    @PostMapping("assign/{id}")
    public ResponseEntity<String> assignProject(@RequestBody ProjectDto projectDto, @PathVariable("id")long id)
    {
        userService.assignProject(projectDto, id);
        return new ResponseEntity<>("Assigned Successfully", HttpStatus.OK);
    }


    @PostMapping("completeProject/{projectId}/user/{userId}")
    public ResponseEntity<String> completeProject(@PathVariable("projectId")long projectId,
                                                   Principal principal)
    {

        userService.completeProject(projectId,principal.getName());
        return new ResponseEntity<>("Assigned Successfully", HttpStatus.OK);
    }


}
