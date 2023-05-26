package com.SpringBasics.EmployeeSystem.Service;

import com.SpringBasics.EmployeeSystem.DTO.EmployeeDto;
import com.SpringBasics.EmployeeSystem.DTO.ManagerDto;

import com.SpringBasics.EmployeeSystem.DataAccess.EmployeeRepository;
import com.SpringBasics.EmployeeSystem.DataAccess.ManagerRepository;
import com.SpringBasics.EmployeeSystem.Entities.Employee;
import com.SpringBasics.EmployeeSystem.Entities.Manager;
import com.SpringBasics.EmployeeSystem.Exception.UserNotFoundException;
import lombok.Builder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ManagerRepository managerRepository;


    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee=this.modelMapper.map(employeeDto,Employee.class);
        employeeRepository.save(employee);
        return employeeDto;

    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new UserNotFoundException("Not found"));
        employeeRepository.delete(employee);
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto,long id) {

        Employee employee=employeeRepository.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found"));


        modelMapper.map(employeeDto, employee);
        employeeRepository.save(employee);
        return modelMapper.map(employee,EmployeeDto.class);
    }

    @Override
    public ManagerDto assignManager(ManagerDto managerDto,long id) {
        Manager manager=this.modelMapper.map(managerDto,Manager.class);
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new UserNotFoundException("Not found"));
        employee.setManager(manager);
        managerRepository.save(manager);

        return managerDto;
    }

    @Override
    public List<Employee> findAllEmployees() {
        List<Employee> employeeList=employeeRepository.findAll();

        return employeeList;
    }


}
