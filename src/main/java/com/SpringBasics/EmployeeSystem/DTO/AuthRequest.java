package com.SpringBasics.EmployeeSystem.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class AuthRequest {

    private String username;

    private String password;

}
