package com.project.paytm.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @RequestMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @RequestMapping("/departments/{deptId}")
    public Optional<Department> getDepartment(@PathVariable int deptId){
        return departmentService.getDepartment(deptId);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/departments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/departments/{deptId}")
    public void updateDepartment(@RequestBody Department department , @PathVariable int deptId){
        departmentService.updateDepartment(deptId , department);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/departments/{deptId}")
    public void deleteDepartment(@PathVariable int deptId){
        departmentService.deleteDepartment(deptId);
    }
}
