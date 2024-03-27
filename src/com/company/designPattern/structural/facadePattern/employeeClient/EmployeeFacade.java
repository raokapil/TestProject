package com.company.designPattern.structural.facadePattern.employeeClient;

public class EmployeeFacade {

    private EmployeeDAO employeeDAO;

    public EmployeeFacade () {
        employeeDAO = new EmployeeDAO();
    }

    public void insert() {
        // Insert into DB
    }

    public Employee getEmployeeDetailsByEmpId(String empId) {
        return new Employee();
    }
}
