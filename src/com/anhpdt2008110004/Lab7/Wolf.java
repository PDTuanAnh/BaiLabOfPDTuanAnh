package com.anhpdt2008110004.Lab7;

public class Wolf extends Canine{
    @Override
    protected void phatTiengKeu() {
        System.out.println("Sói kêu..");
    }
    protected void tiengKeuDemTrangTron(){
        System.out.println("Sói kêu vào đêm trăng tròn..");
    }
    @Override
    protected void an() {
        System.out.println("Ăn kiểu sói..");
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
