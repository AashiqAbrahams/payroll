package com.aashiq.factory.demography;

import com.aashiq.domain.demography.Gender;
import com.aashiq.util.Misc;

public class GenderFactory {

    public static Gender buildGender(String gender){
        return new Gender.Builder()
                .id(Misc.generateId())
                .description(gender)
                .build();
    }
}

