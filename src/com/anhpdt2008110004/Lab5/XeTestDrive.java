package com.anhpdt2008110004.Lab5;

public class XeTestDrive {
    public static void main(String[] args) {
        
        Xe xe;

        xe = new Xe("Phạm Đình Tuấn Anh", "Honda", "Winner 2018", "A1", 4.5);
        
        System.out.println("Tên chủ xe: "+xe.tenChuXe);
        System.out.println("Hãng sản xuất: "+xe.hangSanXuat);
        System.out.println("Dòng: "+xe.dong);
        System.out.println("Giấy phép lái xe hạng "+xe.giayPhep);
        System.out.println("Dung tích bình xăng: "+xe.dungTichXang+" lít");

        xe.tiengDongCo();
        xe.tiengCoi();
        xe.phuonngTienDiLai();
        xe.vatSuuTam();
    }
}
