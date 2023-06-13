package com.SpringBasics.EmployeeSystem.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProjectDto {


    private String project_name;

    private String project_description;

    private Date Start_Date;

    private Date End_Date;
}
