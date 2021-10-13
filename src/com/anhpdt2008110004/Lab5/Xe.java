package com.anhpdt2008110004.Lab5;

public class Xe {
    // attribute
    String tenChuXe;
	String hangSanXuat;
	String dong;
	String giayPhep;
	double dungTichXang;
    // method
    void tiengDongCo(){
        System.out.println("Brum..brum..");
    }
    void tiengCoi(){
        System.out.println("Bíp..bíp..bíp..");
    }
    void phuonngTienDiLai(){
        System.out.println("Là phương tiện giúp con người bớt mệt nhọc khi di chuyển!");
    }
    void vatSuuTam(){
        System.out.println("Những chiếc xe cổ, lâu đời được sưu tầm!");
    }
    // method - function tạo - contructor có nhiều tham số
    Xe(String tCX, String hSX, String dg, String gP, double dTX){
        tenChuXe = tCX;
        hangSanXuat = hSX;
        dong = dg;
        giayPhep = gP;
        dungTichXang = dTX;
    }
}
