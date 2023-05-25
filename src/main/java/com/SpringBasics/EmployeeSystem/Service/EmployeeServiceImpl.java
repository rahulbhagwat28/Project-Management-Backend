package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.EmployeeDto;
import com.SpringBasics.EmployeeSystem.DataAccess.EmployeeRepository;
import com.SpringBasics.EmployeeSystem.Entities.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee=this.modelMapper.map(employeeDto,Employee.class);
        employeeRepository.save(employee);
        return employeeDto;

    }

}
