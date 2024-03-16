package org.example.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.Employees.Employee;
import org.example.Repository.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class EmployeeService {

    private EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    public Employee getEmployeeDetailsById(int employeeId) {
        return employeeRepository.fetchEmployees().stream().filter(employee -> employeeId == employee.getEmployeeId()).findFirst().orElseThrow(() -> new IllegalArgumentException("Employee doesn't exist"));
    }

    public List<Employee> getEmployeeDetails() {
        return employeeRepository.fetchEmployees().stream().collect(Collectors.toList());
    }

    public void addEmployee(Employee employee) {
        try{
            employeeRepository.addEmployee(employee);
            log.info("Employee added successfully!");
        }catch(Exception ex){
            log.error("Exception occurred while adding employee : {}",ex);
        }
    }
}
