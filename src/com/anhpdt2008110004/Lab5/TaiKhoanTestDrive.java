package com.anhpdt2008110004.Lab5;

public class TaiKhoanTestDrive {
    public static void main(String[] args) {
        
        TaiKhoan taiKhoan;

        taiKhoan = new TaiKhoan("Phạm Đình Tuấn Anh", 1059126975, 100);

        System.out.println("Tên chủ tài khoản: "+taiKhoan.tenChuTK);
        System.out.println("Số tài khoản: "+taiKhoan.soTK);
        System.out.println("Số dư trong tài khoản: "+taiKhoan.soDuTrongTK+" nghìn đồng");

        taiKhoan.giuTien();
        taiKhoan.giaoDich();
    }
}
