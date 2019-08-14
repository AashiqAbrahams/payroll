package com.aashiq.controller.user;

import com.aashiq.domain.demography.Gender;
import com.aashiq.domain.demography.Race;
import com.aashiq.domain.user.Employee;
import com.aashiq.domain.user.EmployeeGender;
import com.aashiq.domain.user.EmployeeRace;
import com.aashiq.factory.demography.GenderFactory;
import com.aashiq.factory.demography.RaceFactory;
import com.aashiq.factory.user.EmployeeFactory;
import com.aashiq.factory.user.EmployeeGenderFactory;
import com.aashiq.factory.user.EmployeeRaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeControllerTest {


    private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("Italian");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "123");
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("123", "123");
        Employee employee = EmployeeFactory.buildEmployee("Aashiq", "Abrahams");

        //employeeController.create(employee.getEmployeeNumber(), employee.getEmployeeFirstName() ,employee.getEmployeeLastName(), gender.getId(),race.getId());

        employeeController.create("Aashiq", "Abrahams", 123, 456);

    }
}
