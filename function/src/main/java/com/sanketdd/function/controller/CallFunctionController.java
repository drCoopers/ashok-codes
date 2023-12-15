package com.sanketdd.function.controller;


import com.sanketdd.function.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CallFunctionController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/call")
    public Long getData(){
        return customerRepository.fetchCutomer();
    }
}
