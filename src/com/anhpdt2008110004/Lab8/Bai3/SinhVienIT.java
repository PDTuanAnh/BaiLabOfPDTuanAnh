package com.anhpdt2008110004.Lab8.Bai3;

public class SinhVienIT extends SinhVien{

    double diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hT, double dJ, double dC, double dH) {
        super(hT, "IT");
        this.diemJava = dJ;
        this.diemCSS = dC;
        this.diemHTML = dH;
    }

    @Override
    public double getDiem() {
        return ((2*this.diemJava)+this.diemCSS+this.diemHTML)/4;
    }
    @Override
    public String toString() {
        return "SinhVienIT [diemJava = "+diemJava+", diemCSS = "+diemCSS+", diemHTML = "+diemHTML+", hoTen = "+getHoTen()+"]";
    }

}
