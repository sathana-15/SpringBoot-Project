package com.example.SpringBoot_Project.controllers;


import com.example.SpringBoot_Project.model.Employee;
import com.example.SpringBoot_Project.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class HelloWorldController {
    @Autowired
    private HelloService hws;


    @GetMapping
    public List<Employee> getMethod(){
        return hws.getMethod();
    }


    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable int empId){
        return hws.getEmployeeById(empId);
    }


    @PostMapping
    public String postMethod(@RequestBody Employee e){
        hws.postMethod(e);
        return "Employee Added : "+e;
    }

    //HardCode

    //@PostMapping("/add")
    //public  String postMethod1(){
        //Employee e1 = new Employee(3,"Priya","Business");
       // return hws.postMethod1(e1);
   // }


    //@PutMapping
   // public String putMethod(){
        //return hws.putMethod();
   // }

    @PutMapping
    public String putMethod(@RequestBody Employee e2){
        return hws.updateMethod(e2);
    }


    @DeleteMapping
    public String deleteMethod(){

        return hws.deleteMethod();
    }

    @DeleteMapping("/{empId}")
    public String deleteMethod(@PathVariable int empId){

        return hws.deleteByIdMethod(empId);
    }

}
