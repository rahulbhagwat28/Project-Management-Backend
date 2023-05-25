package com.SpringBasics.EmployeeSystem.DataAccess;

import com.SpringBasics.EmployeeSystem.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


}
