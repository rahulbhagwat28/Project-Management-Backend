package com.SpringBasics.EmployeeSystem.Controllers;


import com.SpringBasics.EmployeeSystem.Constants.Constants;
import com.SpringBasics.EmployeeSystem.DTO.EmployeeDto;
import com.SpringBasics.EmployeeSystem.DataAccess.EmployeeRepository;
import com.SpringBasics.EmployeeSystem.Entities.Employee;
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
        try
        {
              EmployeeDto employeeResponse =employeeService.createEmployee(employeeDto);
              return new ResponseEntity<>(Constants.employeeSuccess, HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable("id")long id)
    {

       try
       {

           Optional<Employee> emp= employeeRepository.findById(id);
           Employee response=emp.get();
            System.out.println(response);
            return new ResponseEntity<>("employee retrieved", HttpStatus.OK);
       }
        catch(Exception e)
        {
            return new ResponseEntity<>("Employee with id"+id+"is not present in the database",HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
