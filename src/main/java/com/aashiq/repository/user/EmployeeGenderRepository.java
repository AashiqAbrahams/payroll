package com.aashiq.repository.user;

import com.aashiq.domain.user.EmployeeGender;
import com.aashiq.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
