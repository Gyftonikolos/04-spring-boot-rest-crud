package com.gyftonikolos.springboot.cruddemo.dao;

import com.gyftonikolos.springboot.cruddemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
