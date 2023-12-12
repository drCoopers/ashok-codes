package com.sanketd.jpa.repository;

import com.sanketd.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {

}
