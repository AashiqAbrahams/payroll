package com.aashiq.service.user;

import com.aashiq.domain.user.Employee;
import com.aashiq.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}