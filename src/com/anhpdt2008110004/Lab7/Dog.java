package com.anhpdt2008110004.Lab7;

public class Dog extends Canine{
    
    protected void phatTiengKeu(){
        System.out.println("Gâu..Gâu..");
    }
    protected void an(){
        System.out.println("Ăn đồ thừa..");
    }
    protected void diLoanhQuanh(){
        System.out.println("Giữ nhà..");
    }
    protected void choiVoiChu(){
        System.out.println("Chơi với chủ..");
    }
    protected void duoiMeo(){
        System.out.println("Đuổi mèo..");
    }
    @Override
    protected void ngu() {
        // TODO Auto-generated method stub
        super.ngu();
    }
}
