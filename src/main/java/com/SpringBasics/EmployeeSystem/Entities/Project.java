package com.SpringBasics.EmployeeSystem.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


//Project Entity
@Entity
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long project_id;

    private String project_name;

    private String project_description;


    private Date Start_Date;

    private Date End_Date;


    public Project(long project_id,String project_name,String project_description)
    {
        this.project_id=project_id;
        this.project_name=project_name;
        this.project_description=project_description;
    }

    @JsonIgnore
    private boolean completed=false;

    @ManyToOne(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;
}
