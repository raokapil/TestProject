package com.company.designPattern.structural.proxyPattern;

public class EmployeeDAOImpl implements EmployeeDAO{
    @Override
    public void createEmployee(String client, EmployeeDO obj) throws Exception {

        System.out.println("Employee Created");
        return;
    }

    @Override
    public void deleteEmployee(String client, int employeeId) throws Exception {

        System.out.println("Employee Deleted");
        return;
    }

    @Override
    public EmployeeDO getEmployee(String client, int employeeId) throws Exception {

        System.out.println("Employee Fetched");
        return new EmployeeDO();
    }
}
