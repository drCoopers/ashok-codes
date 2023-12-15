package com.sanketdd.generator.repository;

import com.sanketdd.generator.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
}
