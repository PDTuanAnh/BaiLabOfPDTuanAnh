package com.anhpdt2008110004.KiemTraGiuaKi;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    public String getTenCongTy() {
        return tenCongTy;
    }
    public void setTriGiaHoaDon(double a) {
        if(0<=a)
            triGiaHoaDon = a;
        else
            System.out.println("Trị giá hóa đơn không hợp lệ!");
    }
    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }
    @Override
    public String toString() {
        String s;
        s = "Tên công ty: "+getTenCongTy()+"Trị giá hóa đơn: "+getTriGiaHoaDon();
        return s;
    }
}
