package com.anhpdt2008110004.Lab5;

public class TaiKhoan {
    // attribute
    String tenChuTK;
	int soTK;
	int soDuTrongTK;
    // method
    void giuTien(){
        System.out.println("Nơi giữ tiền an toàn và bảo mật!");
    }
    void giaoDich(){
        System.out.println("Giao dịch nhanh chóng!");
        System.out.println("Gửi tiền, rút tiền tiện lợi!");
    }
    TaiKhoan(String tCTK, int sTK, int sDTK){
        tenChuTK = tCTK;
        soTK = sTK;
        soDuTrongTK = sDTK;
    }
}
