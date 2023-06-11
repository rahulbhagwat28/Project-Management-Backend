package com.SpringBasics.EmployeeSystem.DTO;

import com.SpringBasics.EmployeeSystem.Entities.Company;
import com.SpringBasics.EmployeeSystem.Entities.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {


    private String name;

    @NotBlank
    private String designation;

    private String username;

    private String email;

    private String password;

    private Set<Role> roles;


}
