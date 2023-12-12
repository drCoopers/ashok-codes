package com.sanketd.jpa.controller;

import com.sanketd.jpa.model.Employee;
import com.sanketd.jpa.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    EmpRepository empRepository;


    @GetMapping("/emp")
    public List<Employee> getAll(){
        return empRepository.findAll();
    }


    @PostMapping
    public Employee addEmp(@RequestBody Employee employee){
        return empRepository.save(employee);
    }


}
