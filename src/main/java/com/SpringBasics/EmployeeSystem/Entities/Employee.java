package com.SpringBasics.EmployeeSystem.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;


    private String name;

    private String designation;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="employee")
    private Collection<Project> projects;

    @ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="manager_id")
    @JsonIgnore
    private Manager manager;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id")
    @JsonIgnore
    private Company company;


}
