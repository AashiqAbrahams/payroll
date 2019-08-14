package com.aashiq.repository.demography;

import com.aashiq.domain.demography.Gender;
import com.aashiq.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
