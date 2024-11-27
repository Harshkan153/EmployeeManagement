package com.employee.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin("http://localhost:3000/")
public class EmpController {




    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public ArrayList<Employee> getAllEmployees(){

        return employeeService.readEmployees();
    }

    @GetMapping("employees/{id}")
    public Employee getAllEmployee(@PathVariable Long id){

        return employeeService.readEmployee(id);
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){

        return(employeeService.createEmployee(employee));

    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){

        if(employeeService.deleteEmployee(id))
            return "deleted successfully";
        else
             return "not found";
    }

    @PutMapping("employees/{id}")
    public String updateEnployee(@PathVariable Long id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id,employee);
    }
}
