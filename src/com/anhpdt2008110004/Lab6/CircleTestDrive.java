package com.anhpdt2008110004.Lab6;

public class CircleTestDrive {
    public static void main(String[] args) {
        
        Circle circle = new Circle(true, "hinhTron.AIF");

        System.out.println("Hình có được nhấp chuột: "+circle.nhapChuotChua);

        System.out.println("Số lần nhấp chuột: "+Circle.soLanNhapChuot);

        circle.xoay();

        System.out.println("Âm thanh phát ra khi được nhấp chuột vào: "+circle.amThanh);

        circle.phatAmThanh();
    }
}
