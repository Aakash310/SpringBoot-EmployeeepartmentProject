package com.project.paytm.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

//    private List<Employee> employeeList = new ArrayList<>(Arrays.asList(
//            new Employee("1","Aakash","aakash.agarwal@gmail.com", LocalDate.of(1999, Month.AUGUST,31),"M",22),
//            new Employee("2","Amrit","amrit.jain@gmail.com",LocalDate.of(2000,Month.JANUARY,20),"M",21),
//            new Employee("3","Manan","manan.garg@gmail.com",LocalDate.of(1999,Month.DECEMBER,8),"M",22)
//    ));

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments(){
        List<Department> departmentList = new ArrayList<>();
        departmentRepository.findAll()
                .forEach(departmentList::add);
        return departmentList;
    }

    public Optional<Department> getDepartment(int deptId){
        return departmentRepository.findById(deptId);
    }

    public void addDepartment(Department department){
        departmentRepository.save(department);
    }

    public void updateDepartment(int deptId , Department department){
        departmentRepository.save(department);
    }

    public void deleteDepartment(int deptId){
        departmentRepository.deleteById(deptId);
    }
}
