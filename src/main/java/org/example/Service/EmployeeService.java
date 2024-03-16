package org.example.Service;

import org.example.Employees.Employee;
import org.example.Repository.EmployeeRepository;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    private EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee getEmployeeDetailsById(int employeeId) {
        return employeeRepository.fetchEmployees().stream().filter(employee -> employeeId == employee.getEmployeeId()).findFirst().orElseThrow(() -> new IllegalArgumentException("Employee doesn't exist"));
    }
}
