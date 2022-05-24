package spring.project.mvc_aop_hibernate.service;

import spring.project.mvc_aop_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees ();

    public void saveEmployee (Employee employee);

    public Employee getEmployee (int id);

    public void deleteEmployee (int id);
}
