package com.example.SpringBoot_Project.service;

import com.example.SpringBoot_Project.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloService {
    List<Employee> emp = new ArrayList<>(
            Arrays.asList(new Employee(1, "sathana", "Trainner"),
                    new Employee(2, "vaishnu", "Faculty"))
    );

    public List<Employee> getMethod() {

        return emp;
    }

    public Employee getEmployeeById(int empId) {
        int ind = 0;
        boolean flag = false;
        for (int i = 0; i < emp.size(); i++) {
            if (empId == emp.get(i).getEmpId()) {
                System.out.println("Emp_ID " + emp.get(i).getEmpId() + emp.get(i));
                ind = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            return emp.get(ind);
        } else {
            return new Employee();
        }
    }

    public String postMethod(Employee e) {

        emp.add(e);
        return "added";
    }

    /*
        public String postMethod1(Employee e1){
            emp.add(e1);
            return "Employee Added Successfully" +e1;
        }
    */
    public String putMethod() {

        return "This is a put Method";

    }

    public String deleteMethod() {

        return "This is a delete method";
    }

    public String deleteByIdMethod(int empId) {
        int ind = 0;
        boolean flag = false;
        for (int i = 0; i < emp.size(); i++) {
            if (empId == emp.get(i).getEmpId()) {
                System.out.println("Emp Id " + emp.get(i).getEmpId()+emp.get(i));
                ind = i;
                flag = true;
                break;
            }

        }
        if (flag) {
            emp.remove(ind);
            return "Employee deleted";
        } else {
            return "Failed to deleted";
        }
    }

    public String updateMethod(Employee e2) {
        int ind=0;
        boolean flag=false;
        for(int i=0;i<emp.size();i++){
            if(e2.getEmpId()==emp.get(i).getEmpId()){
                ind=i;
                flag=true;
            }

        }
        if(flag){
            emp.set(ind,e2);
            return "Employee Updated successfully";
        }
        else{
            return "No such Employee Found!!";
        }
    }
}
