package com.employee.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface EmployeeService {

    String createEmployee(Employee employee);

    ArrayList<Employee> readEmployees();

    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);

    Employee readEmployee(Long id);

}
