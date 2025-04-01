package com.sachinsk.mongocrudpractice.service;

import com.sachinsk.mongocrudpractice.entity.Employee;
import com.sachinsk.mongocrudpractice.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee saveOrUpdate(Employee employee) {
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmp() {
        return employeeRepo.findAll();

    }
}
