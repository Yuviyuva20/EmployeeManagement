package com.mitech.employeemanagementsystem.controller;

import com.mitech.employeemanagementsystem.entity.Employee;
import com.mitech.employeemanagementsystem.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/findById{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findById(id);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody  Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable int id) {
       employeeService.delete(id);
    }
}
