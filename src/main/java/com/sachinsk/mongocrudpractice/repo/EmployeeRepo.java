package com.sachinsk.mongocrudpractice.repo;

import com.sachinsk.mongocrudpractice.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Integer> {
}
