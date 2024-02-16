package com.mitech.employeemanagementsystem.service;

import com.mitech.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    Employee save(Employee employee);

    Employee update(Employee employee);

    Employee findById(int id);

    void delete(int id);
}
