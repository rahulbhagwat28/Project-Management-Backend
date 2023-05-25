package com.SpringBasics.EmployeeSystem.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {




    private String name;

    @NotBlank
    private String designation;

}
