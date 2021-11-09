package com.anhpdt2008110004.Lab9;

import java.util.ArrayList;

public class ShapeManagementTestDrive {
        public static void main(String[] args) {

        ShapeManagement shapeManagement = new ShapeManagement();

        ArrayList<Shape> list;
        list = new ArrayList<>();
        Square square = new Square();
        list.add(square);
        Circle circle = new Circle();
        list.add(circle);
        Triangle triangle = new Triangle();
        list.add(triangle);
        Shape rhombus = new Shape();
        list.add(rhombus);
        Shape rectangular = new Shape();
        list.add(rectangular);

        System.out.println("Hình có được nhấp chuột: "+ShapeManagement.soLanNhapChuot);
        shapeManagement.xoayHinh(square);
        System.out.println();
        System.out.println("Hình có được nhấp chuột: "+ShapeManagement.soLanNhapChuot);
        shapeManagement.xoayHinh(circle);
        System.out.println();
        System.out.println("Hình có được nhấp chuột: "+ShapeManagement.soLanNhapChuot);
        shapeManagement.xoayHinh(triangle);
        System.out.println();
        System.out.println("Hình có được nhấp chuột: "+ShapeManagement.soLanNhapChuot);
        shapeManagement.xoayHinh(rhombus);
        System.out.println();
        System.out.println("Hình có được nhấp chuột: "+ShapeManagement.soLanNhapChuot);
        shapeManagement.xoayHinh(rectangular);
    }
}
