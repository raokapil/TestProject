package com.company.designPattern.structural.facadePattern.employeeClient;

public class EmployeeClient {

    private EmployeeFacade employeeFacade;

    public EmployeeClient() {
        employeeFacade = new EmployeeFacade();
    }
    public Employee getEmployeeDetails (String empId) {
        return employeeFacade.getEmployeeDetailsByEmpId(empId);
    }
}
