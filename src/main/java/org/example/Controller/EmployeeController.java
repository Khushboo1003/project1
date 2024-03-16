package org.example.Controller;

import org.example.Employees.Employee;
import org.example.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getByEmpId")
    public Employee getEmployeeDetailsById(@RequestParam("id") int employeeId){
        return employeeService.getEmployeeDetailsById(employeeId);
    }

}
