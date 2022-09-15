package com.github.vasiljeu95.spring_udemy_springdatajpa.controller;

import com.github.vasiljeu95.spring_udemy_springdatajpa.entity.Employee;
import com.github.vasiljeu95.spring_udemy_springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * MyRESTController
 *
 * @author Stepan Vasilyeu
 * @since 12.09.2022
 */
@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees () {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping("/employees/{id}")
    public Employee showEmployeeById (@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee (@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee (@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee (@PathVariable int id) {
        employeeService.deleteEmployee(id);

        return "Employee with ID = " + id + " was deleted";
    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> showAllEmployeesByName (@PathVariable String name) {
        List<Employee> employeeList = employeeService.findAllByName(name);

        return employeeList;
    }
}
