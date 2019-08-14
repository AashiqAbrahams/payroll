package com.aashiq.repository.demography;

import com.aashiq.domain.demography.Race;
import com.aashiq.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}