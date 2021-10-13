package com.anhpdt2008110004.Lab4;

public class CustomerTestDrive {
    public static void main(String[] args) {
        Customer customer;

        customer = new Customer(10004, "Mr.Tèo", 21, "Nam","123 xyz TPHCM");

        customer.getID();
        customer.getName();
        customer.getAge();
        customer.getSex();
        customer.getAddress();
    }
}
