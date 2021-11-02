package com.anhpdt2008110004.Lab7;

public class Lion extends Feline{

    protected void phatTiengKeu(){
        System.out.println("Sư tử đang kêu..");
    }
    protected void tiengKeuKhiDoi(){
        System.out.println("Tiếng kêu của sư tử đang đói..");
    }
    protected void tiengKeuKhiDauTranh(){
        System.out.println("Tiếng kêu của sư tử khi gặp kẻ thù..");
    }
    protected void an(){
        System.out.println("Ăn kiểu sư tử..");
    }
    @Override
    protected void diLoanhQuanh() {
        // TODO Auto-generated method stub
        super.diLoanhQuanh();
    }
    @Override
    protected void ngu() {
        // TODO Auto-generated method stub
        super.ngu();
    }
}
