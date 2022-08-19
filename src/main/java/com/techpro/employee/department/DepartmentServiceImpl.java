package com.techpro.employee.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl {
    private final DepartmentService departmentService;

    @Autowired
    private DepartmentServiceImpl(DepartmentService departmentService)
    {
        this.departmentService = departmentService;
    }

    public List<Department> findAllDepartmentList()
    {
        return  departmentService.findAllListOfDepartment();
    }
}
