package com.shisha.springboot.thymeleafdemo.services;

import java.util.List;

import com.shisha.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {
    
    public List<Employee> findAll();
    
    public Employee findById(int theId);
    
    public void save(Employee theEmployee);
    
    public void deleteById(int theId);

}
