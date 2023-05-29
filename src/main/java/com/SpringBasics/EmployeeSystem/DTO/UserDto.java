package com.SpringBasics.EmployeeSystem.DTO;

import com.SpringBasics.EmployeeSystem.Entities.Company;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

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




}
