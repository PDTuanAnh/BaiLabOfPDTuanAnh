package com.anhpdt2008110004.Lab7;

public class Cat extends Feline{
    @Override
    protected void phatTiengKeu() {
        System.out.println("Meo..meo..");
    }
    @Override
    protected void an() {
        System.out.println("Ăn kiểu mèo..");
    }
    @Override
    protected void diLoanhQuanh() {
        // TODO Auto-generated method stub
        super.diLoanhQuanh();
    }
    protected void batChuot(){
        System.out.println("Mèo bắt chuột..");
    }
    @Override
    protected void ngu() {
        // TODO Auto-generated method stub
        super.ngu();
    }
}
