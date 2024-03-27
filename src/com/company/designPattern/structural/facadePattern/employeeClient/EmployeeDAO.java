package com.company.designPattern.structural.facadePattern.employeeClient;

public class EmployeeDAO {

    public void insert() {
        // Insert into DB
    }

    public void updateEmployeeName() {
        // Update employee Name
    }

    public Employee getEmployeeDetails(String emailId) {
        return new Employee();
    }

    public Employee getEmployeeDetailsByEmpId(String empId) {
        return new Employee();
    }
}
