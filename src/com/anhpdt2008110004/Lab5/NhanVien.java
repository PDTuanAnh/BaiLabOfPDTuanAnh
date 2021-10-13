package com.anhpdt2008110004.Lab5;

public class NhanVien {
    // attribute
    String tenNhanVien;
	int luong;
	String diaChi;
	String boPhanLamViec;
	int ngaySinh;
    // method
    void chamSocKhachHang(){
        System.out.println("Phục vụ khách hàng uy tín, tận tâm!");
    }
    void lamViec(){
        System.out.println("Làm việc chăm chỉ!");
    }
    void nghiGiaiLao(){
        System.out.println("Bổ sung thể lực trong giờ nghỉ để có sức làm việc!");
    }
    // method - function tạo - contructor có nhiều tham số
    NhanVien(String tNV, int lg, String dC, String bPLV, int nS){
        tenNhanVien = tNV;
        luong = lg;
        diaChi = dC;
        boPhanLamViec = bPLV;
        ngaySinh = nS;
    }
}
