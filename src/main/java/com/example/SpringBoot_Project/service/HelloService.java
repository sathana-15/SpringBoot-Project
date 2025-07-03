package com.example.SpringBoot_Project.service;

import com.example.SpringBoot_Project.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloService {
List<Employee> emp= new ArrayList<>(
      Arrays.asList  (new Employee(1,"sathana","Trainner"),
                      new Employee(2,"vaishnu","Faculty"))
);
    public List<Employee> getMethod(){

        return emp;
    }

    public String postMethod(){
        return "This is a post method";
    }

    public String putMethod(){
        return "This is a put Method";
    }

    public String deleteMethod(){
        return "This is a delete method";
    }
}
