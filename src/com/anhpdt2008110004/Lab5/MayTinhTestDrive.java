package com.anhpdt2008110004.Lab5;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        
        MayTinh mayTinh;

        mayTinh = new MayTinh("Dell", 2020, "MS-Windows", 32, "Core i7", 59, 1);
        
        System.out.println("Nhà sãn xuất: "+mayTinh.nhaSanXuat);
        System.out.println("Năm sản xuất: "+mayTinh.namSanXuat);
        System.out.println("Hệ điều hành: "+mayTinh.heDieuHanh);
        System.out.println("Ram: "+mayTinh.ram+"GB");
        System.out.println("CPU: "+mayTinh.cpu);
        System.out.println("Giá: "+mayTinh.gia+" triệu đồng");
        System.out.println("Năm bảo hành: "+mayTinh.namBaoHanh+" năm kể từ lúc mua");
        
        mayTinh.thucThiCongViec();
        mayTinh.luuTruDuLieu();
        mayTinh.truyenTaiDuLieu();
    }
}
