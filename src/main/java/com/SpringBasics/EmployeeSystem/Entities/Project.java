package com.SpringBasics.EmployeeSystem.Entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long project_id;

    private String project_name;

    private String project_description;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
}
