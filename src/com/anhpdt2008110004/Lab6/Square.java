package com.anhpdt2008110004.Lab6;

public class Square {
    //attribute
    boolean nhapChuotChua;//biến state
    String amThanh;//biến state
    public static int soLanNhapChuot;//biến static; biến class
    //method
    void xoay(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ");
    }
    void phatAmThanh(){
        System.out.println("Đồ rê mi pha sol la si đố..");
    }
    // method - function tạo - contructor có nhiều tham số
    Square(boolean n, String aT){
        nhapChuotChua = n;
        amThanh = aT;
        soLanNhapChuot++;
    }
}
