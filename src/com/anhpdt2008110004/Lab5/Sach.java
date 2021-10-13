package com.anhpdt2008110004.Lab5;

public class Sach {
    // attribute
    int gia;
    String nhaXuatBan;
	int namXuatBan;
	int giaBan;
	int soLuong;
	String loai;
    // method
    void trangTri(){
        System.out.println("Trang trí phòng sách!");
    }
    void giaiTri(){
        System.out.println("Xã stress sau những buổi học!");
    }
    // method - function tạo - contructor có nhiều tham số
    Sach(int g, String nhXB, int nXB, int gB, int sL, String l){
        gia = g;
        nhaXuatBan = nhXB;
        namXuatBan = nXB;
        giaBan = gB;
        soLuong = sL;
        loai = l;

    }

}
