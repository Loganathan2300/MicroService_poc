package com.management.school.controller;


import com.management.school.entity.School;
import com.management.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @GetMapping("school")
    public String getSchoolname(){
        return "G.B.S.SCHOOL";
    }

    @PostMapping("school")
    public School createSchool(@RequestBody School school){
        return schoolService.createSchool(school);
    }
}
