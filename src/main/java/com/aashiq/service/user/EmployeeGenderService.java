package com.aashiq.service.user;

import com.aashiq.domain.user.EmployeeGender;
import com.aashiq.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
