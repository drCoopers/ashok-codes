package com.sanketdd.generator.controller;


import com.sanketdd.generator.model.Employee;
import com.sanketdd.generator.repository.CustomerRepository;
import com.sanketdd.generator.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class CallFunctionController {

    @Autowired
    EmployeeRepository employeeRepository;


    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return  employeeRepository.save(employee);
    }



}
