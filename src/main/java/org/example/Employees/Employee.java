package org.example.Employees;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private List<Integer> contactInfoList;
    private int age;
    private String gender;
    private String address;
    private boolean isActive;
    private float salary;
}
