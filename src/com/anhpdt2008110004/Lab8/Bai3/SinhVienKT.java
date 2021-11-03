package com.anhpdt2008110004.Lab8.Bai3;

public class SinhVienKT extends SinhVien{

    double diemMarketing, diemSales;

    public SinhVienKT(String hT, double dM, double dS) {
        super(hT, "Kế toán");
        this.diemMarketing = dM;
        this.diemSales = dS;
    }

    @Override
    public double getDiem() {
        return ((2*this.diemMarketing)+this.diemSales)/3;
    }
    
    @Override
    public String toString() {
        return "SinhVienIT [diemMarketing = "+diemMarketing+", diemSales = "+diemSales+", họ tên = "+getHoTen()+", ngành = "+getNganh()+"]";
    }
}
