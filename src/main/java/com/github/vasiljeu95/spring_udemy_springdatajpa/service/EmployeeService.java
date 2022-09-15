package com.github.vasiljeu95.spring_udemy_springdatajpa.service;

import com.github.vasiljeu95.spring_udemy_springdatajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);
    void deleteEmployee(int id);

    public List<Employee> findAllByName (String name);
}
