package com.aashiq.service.demography;

import com.aashiq.domain.demography.Gender;
import com.aashiq.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
