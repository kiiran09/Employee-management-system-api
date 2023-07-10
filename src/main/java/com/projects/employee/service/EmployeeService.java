package com.projects.employee.service;

import com.projects.employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeId(long id);

    Employee updateEmployee(Long id, Employee employee);
}
