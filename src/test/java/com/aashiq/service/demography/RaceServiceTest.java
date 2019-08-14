package com.aashiq.service.demography;

import com.aashiq.domain.demography.Race;
import com.aashiq.factory.demography.RaceFactory;
import com.aashiq.repository.demography.RaceRepository;
import com.aashiq.repository.demography.impl.RaceRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceTest {
    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildRace("Italian");
    }


    @Test
    public void getAll(){
        Set<Race> race = this.repository.getAll();
        System.out.println("In getall, all = " + race);
    }
}
