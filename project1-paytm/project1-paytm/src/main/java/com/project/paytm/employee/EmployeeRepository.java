package com.project.paytm.employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee , Integer> {

    public List<Employee> findByDepartmentDeptId(int deptId);
}
