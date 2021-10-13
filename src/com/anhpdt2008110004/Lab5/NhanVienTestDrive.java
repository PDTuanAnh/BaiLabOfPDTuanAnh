package com.anhpdt2008110004.Lab5;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        
        NhanVien nhanVien;

        nhanVien = new NhanVien("Phạm Đình Tuấn Anh", 10, "x/y/z", "Lập trình Website", 13);
        
        System.out.println("Tên nhân viên: "+nhanVien.tenNhanVien);
        System.out.println("Lương "+nhanVien.luong+" triệu đồng");
        System.out.println("Địa chỉ: "+nhanVien.diaChi);
        System.out.println("Bộ phận làm việc: "+nhanVien.boPhanLamViec);
        System.out.println("Ngày sinh: "+nhanVien.ngaySinh);

        nhanVien.chamSocKhachHang();
        nhanVien.lamViec();
        nhanVien.nghiGiaiLao();
    }
}
