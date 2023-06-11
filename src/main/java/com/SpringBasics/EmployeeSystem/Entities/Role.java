package com.SpringBasics.EmployeeSystem.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long role_id;

    private String role_name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<User> users;

    public Role(long role_id, String role_name) {
        this.role_id = role_id;
        this.role_name = role_name;
    }
}
