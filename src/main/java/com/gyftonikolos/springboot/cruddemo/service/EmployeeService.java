package com.gyftonikolos.springboot.cruddemo.service;

import com.gyftonikolos.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
