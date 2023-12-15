package com.sanketdd.generator.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee")
public class Employee {

    /*
    Final value is EMP1
    Hibernate: insert into employee (dept_id,name,performance,salary,status,employee_id) values (?,?,?,?,?,?)

     */

    /*
    *   need to create the table with employee_seq
    * */
    @Id
    @Column(name = "employee_id")
    @GenericGenerator(name = "emp_id_gen", strategy = "com.sanketdd.generator.utility.EmployeeEdGenerator")
    @GeneratedValue(generator = "emp_id_gen" , strategy = GenerationType.SEQUENCE)
    private String employeeId;

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
