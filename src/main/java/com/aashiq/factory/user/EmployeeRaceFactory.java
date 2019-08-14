package com.aashiq.factory.user;

import com.aashiq.domain.user.EmployeeRace;
import com.aashiq.util.Misc;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(String employeeNumber, String raceId){
        return new EmployeeRace.Builder()
                .employeeNumber(Misc.generateId())
                .raceId()
                .build();
    }
}
