package com.aashiq.service.demography;

import com.aashiq.domain.demography.Race;
import com.aashiq.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}
