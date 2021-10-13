package com.anhpdt2008110004.Lab5;

public class SachTestDrive {
    public static void main(String[] args) {
        
        Sach sach;

        sach = new Sach(10000, "Kim Đồng", 2002, 20500, 100, "Truyện tranh");
       
        System.out.println("Giá: "+sach.gia+" đồng");
        System.out.println("Nhà xuất bản: "+sach.nhaXuatBan);
        System.out.println("Năm xuất bản: "+sach.namXuatBan);
        System.out.println("Giá bán: "+sach.giaBan+" đồng");
        System.out.println("Số lương: "+sach.soLuong);
        System.out.println("Loại: "+sach.loai);

        sach.trangTri();
        sach.giaiTri();
    }
}
