package com.sanketdd.trnx.controller;


import com.sanketdd.trnx.model.Customer;
import com.sanketdd.trnx.model.Employee;
import com.sanketdd.trnx.repository.CustomerRepository;
import com.sanketdd.trnx.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientException;

@RestController
@RequestMapping("/api/v1/")
public class CallFunctionController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/call")
    @Transactional(rollbackFor = SQLIntegrityConstraintViolationException.class)
    public ResponseEntity saveData(){
        saveMethod();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional(rollbackFor = SQLIntegrityConstraintViolationException.class)
    private void saveMethod() {
        Employee employee= new Employee();
        employee.setName("pandit");
        employee.setDepartmentId(1L);
        employee.setSalary(20L);
        employee.setPerformance("BAD");
        employee.setStatus(true);
        Employee employees= employeeRepository.save(employee);
        Customer customer= new Customer();

        customer.setCustomerId(employees.getEmployeeId());
        customer.setActive(employee.getStatus());
        customer.setEmail("sam@test.com");
        customer.setPhoneNo("7218515262");
        customer.setLastName("sssaaa");
        customerRepository.save(customer);
    }
}
