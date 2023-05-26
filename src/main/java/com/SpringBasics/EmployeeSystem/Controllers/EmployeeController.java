package com.SpringBasics.EmployeeSystem.Controllers;


import com.SpringBasics.EmployeeSystem.Constants.Constants;
import com.SpringBasics.EmployeeSystem.DTO.EmployeeDto;
import com.SpringBasics.EmployeeSystem.DTO.ManagerDto;
import com.SpringBasics.EmployeeSystem.DataAccess.EmployeeRepository;
import com.SpringBasics.EmployeeSystem.Entities.Employee;
import com.SpringBasics.EmployeeSystem.Exception.UserNotFoundException;
import com.SpringBasics.EmployeeSystem.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;



    @Autowired
    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<String> createEmployee(@RequestBody @Valid EmployeeDto employeeDto)
    {

              EmployeeDto employeeResponse =employeeService.createEmployee(employeeDto);
              return new ResponseEntity<>(Constants.createSuccess, HttpStatus.OK);

    }

    @DeleteMapping("deleteEmplopyee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
    {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(Constants.deleteSuccess, HttpStatus.OK);
    }

    @PostMapping("assignManager/{id}")
    public ResponseEntity<ManagerDto> assignManager(@RequestBody ManagerDto managerDto, @PathVariable("id") long userId)
    {

        ManagerDto response=employeeService.assignManager(managerDto,userId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
