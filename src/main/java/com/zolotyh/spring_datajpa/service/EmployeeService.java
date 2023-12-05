package com.zolotyh.spring_datajpa.service;
import com.zolotyh.spring_datajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

    List<Employee> findAllByName(String name);
}
