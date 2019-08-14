package com.aashiq.repository.user;

import com.aashiq.domain.user.Employee;
import com.aashiq.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}

