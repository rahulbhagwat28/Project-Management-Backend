package com.SpringBasics.EmployeeSystem.DTO;

import com.SpringBasics.EmployeeSystem.Entities.Company;
import com.SpringBasics.EmployeeSystem.Entities.Manager;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {




    private String name;

    @NotBlank
    private String designation;

    private Manager manager;

    private Company company;


}
