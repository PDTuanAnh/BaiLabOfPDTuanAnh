package com.anhpdt2008110004.Lab5;

public class CowTestDrive {
    public static void main(String[] args) {
        
        Cow cow;

        Cow cow2 = new Cow();

        cow = new Cow(15, 5);
        
        System.out.println("Tuổi trong bụng bò mẹ: "+cow2.age+(" tuổi"));
        System.out.println("Giống loài: "+cow2.species);
        System.out.println("Loại thức ăn: "+cow2.kindOfFood);
        System.out.println("Khối lượng: "+cow.weight+("Kg"));
        System.out.println(cow.age+(" tuổi"));

        cow.moo();
        cow.eat();
        cow.sleep();
    }
}
