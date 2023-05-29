package com.SpringBasics.EmployeeSystem.Controllers;


import com.SpringBasics.EmployeeSystem.Constants.Constants;
import com.SpringBasics.EmployeeSystem.DTO.AuthRequest;
import com.SpringBasics.EmployeeSystem.DTO.UserDto;

import com.SpringBasics.EmployeeSystem.Entities.User;
import com.SpringBasics.EmployeeSystem.Entities.UserPrincipal;
import com.SpringBasics.EmployeeSystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

@RestController

@RequestMapping("/api/v1/employees")
public class UserController {

    private UserService userService;

  @Autowired
 AuthenticationManager authenticationManager;





    @Autowired
    DataSource dataSource;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService=userService;
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<String> createEmployee(@RequestBody @Valid UserDto userDto)
    {

              UserDto userResponse =userService.createUser(userDto);
              return new ResponseEntity<>(Constants.createSuccess, HttpStatus.OK);

    }


    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<UserDto> updateEmployee(@RequestBody UserDto userDto, @PathVariable("id") long id)
    {

        UserDto userResponse= userService.updateUser(userDto,id);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteEmplopyee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
    {
        userService.deleteUser(id);
        return new ResponseEntity<>(Constants.deleteSuccess, HttpStatus.OK);
    }



    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest request, @AuthenticationPrincipal UserPrincipal user) throws Exception {



        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(request.getUsername(),
                request.getPassword());

        this.authenticationManager.authenticate(authenticationToken);

        System.out.println(this.authenticationManager.authenticate(authenticationToken));



        return new ResponseEntity<>("Logged in Successfully", HttpStatus.OK);
    }



    @GetMapping("findAllEmployees")
    public ResponseEntity<List<User>> findAllEmployees()
    {


        List<User> response=userService.findAllUsers();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
