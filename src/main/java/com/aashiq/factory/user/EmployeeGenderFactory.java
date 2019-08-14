package com.aashiq.factory.user;

import com.aashiq.domain.user.EmployeeGender;
import com.aashiq.util.Misc;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String employeeNumber,String genderId){
        return new EmployeeGender.Builder()
                .employeeNumber(Misc.generateId())
                .genderId()
                .build();
    }
}
