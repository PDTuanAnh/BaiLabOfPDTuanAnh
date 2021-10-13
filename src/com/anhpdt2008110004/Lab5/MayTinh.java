package com.anhpdt2008110004.Lab5;

public class MayTinh {
    // attribute
    String nhaSanXuat;
	int namSanXuat;
	String heDieuHanh;
	int ram;
	String cpu;
	int gia;
	int namBaoHanh;
    // method
    void thucThiCongViec(){
        System.out.println("Làm tính nhanh và chính xác!");
        System.out.println("Làm việc không mệt mỏi, không ngừng nghỉ!");
    }
    void luuTruDuLieu(){
        System.out.println("Lưu trữ rất nhiều thông tin!");
    }
    void truyenTaiDuLieu(){
        System.out.println("Truyền tải thông tin qua khoảng cách xa trong thời gian ngắn!");
    }
    MayTinh(String nhSX, int nSX, String hDH, int r, String c, int g, int nBH){
        nhaSanXuat = nhSX;
        namSanXuat = nSX;
        heDieuHanh = hDH;
        ram = r;
        cpu = c;
        gia = g;
        namBaoHanh = nBH;
    }
}
