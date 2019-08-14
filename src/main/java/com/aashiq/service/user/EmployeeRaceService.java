package com.aashiq.service.user;

import com.aashiq.domain.user.EmployeeRace;
import com.aashiq.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
