package com.sachinsk.mongocrudpractice.controller;

import com.sachinsk.mongocrudpractice.entity.Employee;
import com.sachinsk.mongocrudpractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.saveOrUpdate(employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.ACCEPTED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Employee>> findAllEmployee() {
        return new ResponseEntity<>(employeeService.findAllEmp(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmp(id);
        return new ResponseEntity<>("Employee deleted successfully!", HttpStatus.OK);

    }
}
