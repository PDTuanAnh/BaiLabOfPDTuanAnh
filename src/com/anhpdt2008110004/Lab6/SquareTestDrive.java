package com.anhpdt2008110004.Lab6;

public class SquareTestDrive {
    public static void main(String[] args) {  
        
        Square square = new Square(true, "hinhVuong.AIF");

        System.out.println("Hình có được nhấp chuột: "+square.nhapChuotChua);

        System.out.println("Số lần nhấp chuột: "+Square.soLanNhapChuot);

        square.xoay();

        System.out.println("Âm thanh phát ra khi được nhấp chuột vào: "+square.amThanh);

        square.phatAmThanh();
    }
}
