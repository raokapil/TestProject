package com.company.designPattern.structural.proxyPattern;

public class EmployeeDAOProxy implements EmployeeDAO{

    EmployeeDAO employeeDAO;

    EmployeeDAOProxy() {
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void createEmployee(String client, EmployeeDO obj) throws Exception {

        if (client.equals("ADMIN")) {

            employeeDAO.createEmployee(client, obj);
            return;
        }
        throw new Exception("Not allowed to create user");
    }

    @Override
    public void deleteEmployee(String client, int employeeId) throws Exception {

        if (client.equals("ADMIN")) {

            employeeDAO.deleteEmployee(client, employeeId);
            return;
        }
        throw new Exception("Not allowed to Delete user");
    }

    @Override
    public EmployeeDO getEmployee(String client, int employeeId) throws Exception {

        if (client.equals("ADMIN") || client.equals("DELETE")) {

            return employeeDAO.getEmployee(client, employeeId);
        }
        throw new Exception("Not allowed to get user");
    }
}
