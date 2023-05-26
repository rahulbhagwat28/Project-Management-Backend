package com.SpringBasics.EmployeeSystem.DataAccess;

import com.SpringBasics.EmployeeSystem.Entities.Employee;
import com.SpringBasics.EmployeeSystem.Entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Long> {


}
