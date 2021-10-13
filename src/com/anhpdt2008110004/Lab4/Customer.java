package com.anhpdt2008110004.Lab4;

public class Customer {
    int customerID;
    String name;
    int age;
    String sex;
    String address;

    Customer(int cID, String n, int a, String s, String ad){
        customerID = cID;
        name = n;
        age = a;
        sex = s;
        address = ad;
    }

    void getID(){
        System.out.println("Mã khách hàng: "+customerID);
    }

    void getName(){
        System.out.println("Tên khách hàng: "+name);
    }

    void getAge(){
        System.out.println("Tuổi khách hàng: "+age+" tuổi");
    }

    void getSex(){
        System.out.println("Giới tính khách hàng: "+sex);
    }

    void getAddress(){
        System.out.println("Địa chỉ khách hàng: "+address);
    }
}
