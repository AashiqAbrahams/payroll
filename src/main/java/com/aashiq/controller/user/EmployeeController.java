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
import com.aashiq.service.demography.GenderService;
import com.aashiq.service.demography.RaceService;
import com.aashiq.service.demography.impl.GenderServiceImpl;
import com.aashiq.service.demography.impl.RaceServiceImpl;
import com.aashiq.service.user.EmployeeGenderService;
import com.aashiq.service.user.EmployeeRaceService;
import com.aashiq.service.user.EmployeeService;
import com.aashiq.service.user.impl.EmployeeGenderServiceImpl;
import com.aashiq.service.user.impl.EmployeeRaceServiceImpl;
import com.aashiq.service.user.impl.EmployeeServiceImpl;

import java.util.Set;

public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getEmployeeService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
    private EmployeeRaceService employeeRaceService = EmployeeRaceServiceImpl.getEmployeeRaceService();
    private RaceService raceService = RaceServiceImpl.getRaceService();
    private GenderService genderService = GenderServiceImpl.getGenderService();

    public void create(String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.buildEmployee(firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "456");
        employeeGenderService.create(employeeGender);

        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("567", "987");
        employeeRaceService.create(employeeRace);

        Race race = RaceFactory.buildRace("Italian");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender("Male");
        genderService.create(gender);


    }


}
