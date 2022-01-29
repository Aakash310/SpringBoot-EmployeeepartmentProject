package com.project.paytm.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

//    private List<Employee> employeeList = new ArrayList<>(Arrays.asList(
//            new Employee("1","Aakash","aakash.agarwal@gmail.com", LocalDate.of(1999, Month.AUGUST,31),"M",22),
//            new Employee("2","Amrit","amrit.jain@gmail.com",LocalDate.of(2000,Month.JANUARY,20),"M",21),
//            new Employee("3","Manan","manan.garg@gmail.com",LocalDate.of(1999,Month.DECEMBER,8),"M",22)
//    ));

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(int deptId){
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findByDepartmentDeptId(deptId)
                .forEach(employeeList::add);
        return employeeList;
    }

    public Optional<Employee> getEmployee(int empId){
        return employeeRepository.findById(empId);
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int empId){
        employeeRepository.deleteById(empId);
    }
}
