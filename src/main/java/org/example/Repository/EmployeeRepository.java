package org.example.Repository;

import org.example.Employees.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class EmployeeRepository {

    public List<Employee> fetchEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        List<Integer> contactList = Arrays.asList(1234567890, 12321213);
        employeeList.add(new Employee(1, "Akash", "Singh", contactList, 27, "Male", "Asf Insignia", true, 1000));
        employeeList.add(new Employee(2, "Bikash", "Singh", contactList, 28, "Male", "Asf Insignia", true, 2000));
        employeeList.add(new Employee(3, "Pramila", "Singh", contactList, 40, "Female", "Bangalore", true, 2000));
        employeeList.add(new Employee(4, "Purnima", "Singh", contactList, 21, "Female", "Gurgaon", true, 5000));
        employeeList.add(new Employee(5, "Khushboo", "Singh", contactList, 56, "Female", "Jodhpur", true, 3000));
        employeeList.add(new Employee(6, "Mithlesh", "Singh", contactList, 55 , "Male", "Jodhpur", true, 9000));
        employeeList.add(new Employee(7, "Rajendra", "Singh", contactList, 37, "Male", "Jodhpur", true, 7000));
        employeeList.add(new Employee(8, "Vinit", "Singh", contactList, 17, "Male", "Asf Insignia", true, 8000));
        employeeList.add(new Employee(9, "TJ", null, contactList, 27, "Male", "Hyderabad", true, 7000));
        employeeList.add(new Employee(10, "Aashish", "Anand", contactList, 26, "Male", "Shahdara Delhi", true, 9000));
        employeeList.add(new Employee(11, "Prachi", "Rana", contactList, 27, "Male", "IGNOU", true, 10000));
        return employeeList;
    }
}
