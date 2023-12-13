package com.sanketd.jpa.controller;

import com.sanketd.jpa.model.Employee;
import com.sanketd.jpa.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
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

    @GetMapping("/sort")
    public List<Employee> getbySort(){
        Sort sort = Sort.by("empSalary").ascending();
        return  empRepository.findAll(sort);
    }


    @GetMapping("/find")
    public List<Employee> findByEmp(){
        Employee employee= new Employee();
        employee.setEmpName("sanket");
        employee.setId(1L);

        Example<Employee> of = Example.of(employee);

        return  empRepository.findAll(of);
    }

    @PostMapping("/emp")
    public Employee addEmp(@RequestBody Employee employee){
        return empRepository.save(employee);
    }


}
