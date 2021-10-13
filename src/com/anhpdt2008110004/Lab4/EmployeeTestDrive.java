package com.anhpdt2008110004.Lab4;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee;

        employee = new Employee(844, "Mr.Tý", 23, "Nam", "321 zyx TPHCM", "Chăm sóc khách hàng", 50);

        employee.getID();
        employee.getName();
        employee.getAge();
        employee.getSex();
        employee.getAddress();
        employee.getWorkingParts();
        employee.getSalary();
    }
}
