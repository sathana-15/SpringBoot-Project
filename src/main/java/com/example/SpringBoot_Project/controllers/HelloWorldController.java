package com.example.SpringBoot_Project.controllers;


import com.example.SpringBoot_Project.model.Employee;
import com.example.SpringBoot_Project.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HelloWorldController {
    @Autowired
    private HelloService hws;

    @GetMapping("/")
    public List<Employee> hello(){

        return hws.getMethod();
    }


    @PostMapping("/")
    public String postMethod(){
        return hws.postMethod();
    }


    @PutMapping
    public String putMethod(){
        return hws.putMethod();
    }


    @DeleteMapping
    public String deleteMethod(){
        return hws.deleteMethod();
    }

}
