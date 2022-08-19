package com.techpro.employee.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "department")
@CrossOrigin(origins = "*")
public class DepartmentController {
    private final DepartmentServiceImpl departmentServiceImpl;

    @Autowired
    private DepartmentController(DepartmentServiceImpl departmentServiceImpl){
        this.departmentServiceImpl = departmentServiceImpl;
    }

    @GetMapping("findAll")
    public List<Department> findAllDepartmentList(){
        //List<Department> departments = new ArrayList<>();
        //departments = departmentServiceImpl.findAllDepartmentList();
        //return departments;
        return departmentServiceImpl.findAllDepartmentList();
    }
}
