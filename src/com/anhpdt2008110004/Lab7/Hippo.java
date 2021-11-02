package com.anhpdt2008110004.Lab7;

public class Hippo extends Animal{
    @Override
    protected void phatTiengKeu() {
        System.out.println("Hà mã kêu...");
    }
    @Override
    protected void an() {
        System.out.println("Ăn kiểu hà mã..");
    }
    @Override
    protected void ngu() {
        // TODO Auto-generated method stub
        super.ngu();
    }
    @Override
    protected void diLoanhQuanh() {
        // TODO Auto-generated method stub
        super.diLoanhQuanh();
    }
}
