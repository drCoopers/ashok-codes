package com.sanketdd.trnx.repository;

import com.sanketdd.trnx.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
