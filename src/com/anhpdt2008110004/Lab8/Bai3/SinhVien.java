package com.anhpdt2008110004.Lab8.Bai3;

public abstract class SinhVien {
    private String hoTen;
    private String nganh;

    public SinhVien(String hT, String n){
        this.hoTen = hT;
        this.nganh = n;
    }
    
    public abstract double getDiem();

    public String getHocLuc(){
        String hocLuc = "";
        if(getDiem() < 5) {
            hocLuc =  "Yếu";
        }else if(getDiem() >= 5 && getDiem() < 6.5){
            hocLuc = "Trung bình";
        }else if(getDiem() >= 6.5 && getDiem() < 7.5){
            hocLuc = "Khá";
        }else if(getDiem() >= 7.5 && getDiem() < 9) {
            hocLuc = "Giỏi";
        }else if(getDiem() >= 9) {
            hocLuc = "Xuất sắc";
        }
        return hocLuc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void xuat(){
        System.out.println("Họ tên: "+this.hoTen);
        System.out.println("Ngành: "+this.nganh);
        System.out.println("Điểm: "+this.getDiem());
        System.out.println("Học lực: "+this.getHocLuc());
    }

}
