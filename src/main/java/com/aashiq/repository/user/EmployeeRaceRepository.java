package com.aashiq.repository.user;

import com.aashiq.domain.user.EmployeeRace;
import com.aashiq.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
