package com.anhpdt2008110004.Lab4;

public class Employee {
    int employeeID;
    String name;
    int age;
    String sex;
    String address;
    String workingParts;
    int salary;

    Employee(int eID, String n, int a,String s, String ad, String w, int slr){
        employeeID = eID;
        name = n;
        age = a;
        sex = s;
        address = ad;
        workingParts = w;
        salary = slr;
    }

    void getID(){
        System.out.println("Mã nhân viên: "+employeeID);
    }

    void getName(){
        System.out.println("Tên nhân viên: "+name);
    }

    void getAge(){
        System.out.println("Tuổi nhân viên: "+age+" tuổi");
    }

    void getSex(){
        System.out.println("Giới tính nhân viên: "+sex);
    }

    void getAddress(){
        System.out.println("Địa chỉ nhân viên: "+address);
    }

    void getWorkingParts(){
        System.out.println("Nhân viên làm việc tại bộ phận: "+workingParts);
    }

    void getSalary(){
        System.out.println("Lương nhân viên: "+salary+" triệu");
    }
}
