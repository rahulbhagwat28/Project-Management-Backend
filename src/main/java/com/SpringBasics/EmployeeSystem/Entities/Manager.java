package com.SpringBasics.EmployeeSystem.Entities;


import jakarta.persistence.*;

import java.util.Collection;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long m_id;

    private String manager_name;

    //One manager can have multiple employees under him
    @OneToMany(cascade = CascadeType.PERSIST,fetch=FetchType.EAGER,mappedBy="manager")
   private Collection<Employee> employees;



}
