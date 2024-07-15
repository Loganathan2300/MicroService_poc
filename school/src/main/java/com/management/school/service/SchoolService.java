package com.management.school.service;

import com.management.school.entity.School;
import com.management.school.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    SchoolRepository schoolRepository;

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }
}
