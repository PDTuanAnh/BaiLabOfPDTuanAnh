package com.anhpdt2008110004.KiemTraGiuaKi;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    public void setHeSoLuong(float a) {
        if(1<=a)
            heSoLuong = a;
        else
            System.out.println("Hệ số lương không hợp lệ!");
    }
    public float getHeSoLuong() {
        return heSoLuong;
    }
    protected float tinhLuong(){
        float luong;
        luong = heSoLuong * 1500000;
        return luong;
    }
    @Override
    public String toString() {
        String s;
        s = "Hệ số lương: "+getHeSoLuong()+"Lương: "+tinhLuong();
        return s;
    }
}
