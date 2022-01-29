package com.project.paytm.employee;

import com.project.paytm.department.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("departments/{deptId}/employees")
    public List<Employee> getAllEmployees(@PathVariable int deptId){
        return employeeService.getAllEmployees(deptId);
    }

    @RequestMapping("departments/{deptId}/employees/{empId}")
    public Optional<Employee> getEmployee(@PathVariable int empId){
        return employeeService.getEmployee(empId);
    }

    @RequestMapping(method = RequestMethod.POST , value = "departments/{deptId}/employees")
    public void addEmployee(@RequestBody Employee employee, @PathVariable int deptId){
        employee.setDepartment(new Department(deptId,"",""));
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "departments/{deptId}/employees/{empId}")
    public void updateEmployee(@RequestBody Employee employee ,@PathVariable int deptId){
        employee.setDepartment(new Department(deptId,"",""));
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "departments/{deptId}/employees/{empId}")
    public void deleteEmployee(@PathVariable int empId){
        employeeService.deleteEmployee(empId);
    }
}
