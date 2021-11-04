package com.anhpdt2008110004.KiemTraGiuaKi;

public class Nguoi {
    private String hoTen;
    private String diaChi;

    protected void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    protected String getHoTen(){
        return hoTen;
    }
    protected void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getDiaChi() {
        return diaChi;
    }
    @Override
    public String toString() {
        return (getHoTen()+getDiaChi());
    }
}
