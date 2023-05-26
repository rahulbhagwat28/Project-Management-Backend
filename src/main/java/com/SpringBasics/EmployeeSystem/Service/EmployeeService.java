package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.EmployeeDto;
import com.SpringBasics.EmployeeSystem.DTO.ManagerDto;
import com.SpringBasics.EmployeeSystem.Entities.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    void deleteEmployee(long id);

    EmployeeDto updateEmployee(EmployeeDto employeeDto,long id);

    ManagerDto assignManager(ManagerDto managerDto,long id);

    List<Employee> findAllEmployees();

}
