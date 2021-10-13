package com.anhpdt2008110004.Lab5;

public class Cow {
    // attribute
    double weight;
    int age;
    String species;
    String kindOfFood;
    // method

    // hàm tạo mặc định
    Cow(){
        // thiết lập thông tin khởi tạo ban đầu cho bò
        age = 1;// tuổi trong bụng bò mẹ
        species = "Bò sữa";
        kindOfFood = "Cỏ";
    }
    Cow(double w, int a){
        weight = w;
        age = a;
    }
    void moo(){
        System.out.println("Beee..beee..beee..");
    }
    void eat(){
        System.out.println("Grôp..grôp..grôp..");
    }
    void sleep(){
        System.out.println("z.Z.Z.z.Z...z.Z.z.Z.z.Z...");
    }
}
