package com.aashiq.factory.demography;


import com.aashiq.domain.demography.Race;
import com.aashiq.util.Misc;

public class RaceFactory {

    public static Race buildRace(String race){
        return new Race.Builder()
                .id(Misc.generateId())
                .description(race)
                .build();
    }

}
