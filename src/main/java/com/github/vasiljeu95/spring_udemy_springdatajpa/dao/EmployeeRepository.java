package com.github.vasiljeu95.spring_udemy_springdatajpa.dao;

import com.github.vasiljeu95.spring_udemy_springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName (String name);
}
