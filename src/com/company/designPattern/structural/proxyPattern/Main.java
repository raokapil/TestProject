package com.company.designPattern.structural.proxyPattern;

/**
 * Proxy is a structural design pattern that lets you provide a substitute or placeholder for another
 * object. A proxy controls access to the original object, allowing you to perform something either
 * before or after the request gets through to the original object.
 *
 * Pros :
 *
 *  You can control the service object without clients knowing about it.
 *
 *  You can manage the lifecycle of the service object when clients don’t care about it.
 *
 *  The proxy works even if the service object isn’t ready or is not available.
 *
 *  Open/Closed Principle. You can introduce new proxies without changing the service or clients.
 */

// Usage : PreProcessing and PostProcessing of any request
// Access Restriction and caching
// Spring Boot creates proxy of every bean
public class Main {

    public static void main(String[] args) {

        try {
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();
            employeeDAO.createEmployee("ADMIN", new EmployeeDO());
            System.out.println("Successful");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
