package com.SpringBasics.EmployeeSystem.DataAccess;

import com.SpringBasics.EmployeeSystem.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;


/*
Role Data Access Object
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
