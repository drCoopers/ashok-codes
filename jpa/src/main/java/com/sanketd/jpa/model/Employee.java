package com.sanketd.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @Column
    @GeneratedValue
    public Long id;

    @Column(name = "emp_name")
    public String empName;

    @Column(name = "emp_salary")
    public Double empSalary;

    @Column(name = "emp_address")
    public String empAddess;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpAddess() {
        return empAddess;
    }

    public void setEmpAddess(String empAddess) {
        this.empAddess = empAddess;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empAddess='" + empAddess + '\'' +
                '}';
    }
}
