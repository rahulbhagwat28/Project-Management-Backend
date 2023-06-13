package com.SpringBasics.EmployeeSystem.DTO;

import com.SpringBasics.EmployeeSystem.Constraints.CustomPassword;
import com.SpringBasics.EmployeeSystem.Entities.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {


    @NotNull(message="Name cannot be kept blank")
    private String name;

    @NotBlank(message="A Designation must be provided")
    private String designation;

    @NotNull(message="A Username must be provided")
    private String username;


    @Email(message = "Invalid Email format")
    private String email;

    @CustomPassword
    private String password;


    private Set<Role> roles;


}
