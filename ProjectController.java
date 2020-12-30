package com.example.minorProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {


    @GetMapping("/test")
    public Employee fetchEmployee()
    {
        return new Employee("TestName","TestAddress",30,30000);
    }

}
