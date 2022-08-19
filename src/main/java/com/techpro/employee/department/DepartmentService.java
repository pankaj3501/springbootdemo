package com.techpro.employee.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    private DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveOrUpdate(Department department)
    {
        return departmentRepository.save(department);
    }

    public List<Department> findAllListOfDepartment()
    {
        return departmentRepository.findAll();
    }
}
