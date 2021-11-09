package com.anhpdt2008110004.Lab9;

public class Shape {
    
    private Boolean nhapChuotChua;
    private String amThanh;
    public static int soLanNhapChuot;

    Shape(){
        nhapChuotChua = true;
        soLanNhapChuot++;
    }

    Shape(Boolean n, String aT){
        nhapChuotChua = n;
        amThanh = aT;
    }

    protected void xoay(){
        System.out.println("Xoay 360 độ theo chiều kim đồng hồ");
    }

    protected void phatAmThanh(){
        System.out.println("Đồ rê mi pha sol la si đố..");
    }
}
