package com.sanketdd.function.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "dept_id")
    private Long departmentId;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "performance")
    private String performance;


    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
