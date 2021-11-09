package com.anhpdt2008110004.Lab9;

public class ShapeManagement {
    private Boolean nhapChuotChua;
    private String amThanh;
    public static int soLanNhapChuot;

    public ShapeManagement(){
        nhapChuotChua = true;
        soLanNhapChuot++;
    }
    
    public void xoayHinh(Shape s){
        s.xoay();
        s.phatAmThanh();
    }
}
