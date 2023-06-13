package com.SpringBasics.EmployeeSystem.DataAccess;

import com.SpringBasics.EmployeeSystem.Entities.Project;
import com.SpringBasics.EmployeeSystem.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


/*
Project Data Access Object
 */
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
