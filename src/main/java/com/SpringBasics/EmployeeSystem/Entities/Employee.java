package com.SpringBasics.EmployeeSystem.Entities;

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

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="manager_id")
    private Manager manager;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id")
    private Company company;


}
