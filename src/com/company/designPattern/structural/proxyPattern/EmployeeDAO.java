package com.company.designPattern.structural.proxyPattern;

public interface EmployeeDAO {

    void createEmployee(String client, EmployeeDO obj) throws Exception;
    void deleteEmployee(String client, int employeeId) throws Exception;
    EmployeeDO getEmployee(String client, int employeeId) throws Exception;
}
