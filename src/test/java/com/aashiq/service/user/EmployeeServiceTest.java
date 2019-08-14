package com.aashiq.service.user;

import com.aashiq.domain.user.Employee;
import com.aashiq.factory.user.EmployeeFactory;
import com.aashiq.repository.user.EmployeeRepository;
import com.aashiq.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Aashiq", "Abrahams");
    }


    @Test
    public void getAll(){
        Set<Employee> employee = this.repository.getAll();
        System.out.println("In getall, all = " + employee);
    }

}
