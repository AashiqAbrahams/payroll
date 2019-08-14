package com.aashiq.service.user;

import com.aashiq.domain.user.EmployeeRace;
import com.aashiq.factory.user.EmployeeRaceFactory;
import com.aashiq.repository.user.EmployeeRaceRepository;
import com.aashiq.repository.user.impl.EmployeeRaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceTest {
    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.buildEmployeeRace("Aashiq", "Abrahams");
    }


    @Test
    public void getAll(){
        Set<EmployeeRace> employeeRace = this.repository.getAll();
        System.out.println("In getall, all = " + employeeRace);
    }

}
