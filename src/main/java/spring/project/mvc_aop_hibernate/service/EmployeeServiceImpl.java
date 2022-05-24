package spring.project.mvc_aop_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.project.mvc_aop_hibernate.dao.EmployeeDAO;
import spring.project.mvc_aop_hibernate.entity.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Transactional
    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Transactional
    @Override
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);

    }
}
