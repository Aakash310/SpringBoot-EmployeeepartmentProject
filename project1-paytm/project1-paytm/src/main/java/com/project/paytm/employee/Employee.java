package com.project.paytm.employee;

import com.project.paytm.department.Department;
import org.springframework.cglib.core.Local;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    private int empId;
    private String name;
    private String email;
    private LocalDate dob;
    private String gender;
    private Integer age;

    @ManyToOne
    private Department department;

    public Employee() {
    }

    public Employee(int empId, String name, String email, LocalDate dob, String gender, Integer age , int deptId) {
        super();
        this.empId = empId;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
        this.department=new Department(deptId,"","");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
