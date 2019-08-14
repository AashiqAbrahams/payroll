package com.aashiq.service.demography;

import com.aashiq.domain.demography.Gender;
import com.aashiq.factory.demography.GenderFactory;
import com.aashiq.repository.demography.GenderRepository;
import com.aashiq.repository.demography.impl.GenderRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceTest {
    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }


    @Test
    public void getAll(){
        Set<Gender> gender = this.repository.getAll();
        System.out.println("In getall, all = " + gender);
    }
}
