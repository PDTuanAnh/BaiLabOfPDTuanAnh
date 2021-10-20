package com.anhpdt2008110004.Lab6;

public class TriangleTestDrive {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(true, "hinhVuong.AIF");

        System.out.println("Hình có được nhấp chuột: "+triangle.nhapChuotChua);

        System.out.println("Số lần nhấp chuột: "+Triangle.soLanNhapChuot);

        triangle.xoay();

        System.out.println("Âm thanh phát ra khi được nhấp chuột vào: "+triangle.amThanh);

        triangle.phatAmThanh();
    }
}
