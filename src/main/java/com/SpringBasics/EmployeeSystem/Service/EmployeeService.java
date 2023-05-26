package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.EmployeeDto;
import com.SpringBasics.EmployeeSystem.DTO.ManagerDto;

public interface EmployeeService {

    EmployeeDto createEmployee(EmployeeDto employeeDto);

    void deleteEmployee(long id);

    ManagerDto assignManager(ManagerDto managerDto,long id);

}
