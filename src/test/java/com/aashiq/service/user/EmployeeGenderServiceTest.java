package com.aashiq.service.user;

import com.aashiq.domain.user.EmployeeGender;
import com.aashiq.factory.user.EmployeeGenderFactory;
import com.aashiq.repository.user.EmployeeGenderRepository;
import com.aashiq.repository.user.impl.EmployeeGenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceTest {
    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.buildEmployeeGender("Aashiq", "Abrahams");
    }


    @Test
    public void getAll(){
        Set<EmployeeGender> employeeGender = this.repository.getAll();
        System.out.println("In getall, all = " + employeeGender);
    }

}
