package com.github.vasiljeu95.spring_udemy_springdatajpa.service;

import com.github.vasiljeu95.spring_udemy_springdatajpa.dao.EmployeeRepository;
import com.github.vasiljeu95.spring_udemy_springdatajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * EmployeeServiceImpl
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if (employeeOptional.isPresent()) {
            employee = employeeOptional.get();
        }

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        List<Employee> employeeList = employeeRepository.findAllByName(name);

        return employeeList;
    }
}
