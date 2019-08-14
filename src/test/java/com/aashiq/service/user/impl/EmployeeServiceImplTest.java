package com.aashiq.service.user.impl;

import com.aashiq.domain.user.Employee;
import com.aashiq.factory.user.EmployeeFactory;
import com.aashiq.repository.user.impl.EmployeeRepositoryImpl;
import com.aashiq.service.user.EmployeeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {
    private EmployeeRepositoryImpl repository;
    private Employee employee;
    private EmployeeService service;


    @Before
    public void setUp() throws Exception {
        this.service = EmployeeServiceImpl.getEmployeeService();
    }

    @Test
    public void a_create() {
        Employee employee = EmployeeFactory.buildEmployee("Aashiq", "Abrahams");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Employee employee = EmployeeFactory.buildEmployee("Aashiq", "Abrahams");

        service.create(employee);
        Employee inRepo = service.read(employee.getEmployeeNumber());

        employee.setEmployeeFirstName("Badee");

        service.update(employee);

        Assert.assertEquals(employee.getEmployeeNumber(), inRepo.getEmployeeNumber());
    }

    @Test
    public void e_delete() {
        Employee employee = EmployeeFactory.buildEmployee("Aashiq", "Abrahams");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getEmployeeNumber());

        Employee deleted = service.read(employee.getEmployeeNumber());

        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Employee employee = EmployeeFactory.buildEmployee("Aashiq", "Abrahams");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmployeeNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }

}
