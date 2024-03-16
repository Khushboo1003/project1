package org.example.Controller;

import org.example.Employees.Employee;
import org.example.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getEmployeeDetails")
    public List<Employee> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }

    @PostMapping(value = "/addEmployee", consumes = {"application/json"})
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "SUCCESS";
    }

}
