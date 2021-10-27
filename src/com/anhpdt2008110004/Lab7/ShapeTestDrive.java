package com.anhpdt2008110004.Lab7;

public class ShapeTestDrive {
    public static void main(String[] args) {
        System.out.println("Hình vuông");
        Square square = new Square();
        System.out.println("Hình có được nhấp chuột: "+square.nhapChuotChua);
        System.out.println("Số lần nhấp chuột: "+Square.soLanNhapChuot);
        square.xoay();
        square.phatAmThanh();

        System.out.println();
        System.out.println("Hình tròn");
        Circle circle = new Circle();
        System.out.println("Hình có được nhấp chuột: "+circle.nhapChuotChua);
        System.out.println("Số lần nhấp chuột: "+Circle.soLanNhapChuot);
        circle.xoay();
        circle.phatAmThanh();

        System.out.println();
        System.out.println("Hình tam giác");
        Triangle triangle = new Triangle();
        System.out.println("Hình có được nhấp chuột: "+triangle.nhapChuotChua);
        System.out.println("Số lần nhấp chuột: "+Triangle.soLanNhapChuot);
        triangle.xoay();
        triangle.phatAmThanh();
        
    }
}
