package com.SpringBasics.EmployeeSystem.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


import lombok.*;

@Entity
@Data

@NoArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;


    private String name;

    private String designation;

    private String username;

    private String email;

    private String password;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy="user")
    private Collection<Project> projects;



    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="company_id")
    @JsonIgnore
    private Company company;




    public User(String username,String email,String password)
    {
        this.username=username;
        this.email=email;
        this.password=password;
    }



}