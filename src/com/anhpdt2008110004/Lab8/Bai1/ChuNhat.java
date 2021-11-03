package com.anhpdt2008110004.Lab8.Bai1;

public class ChuNhat {
    double rong;
    double dai;

    public ChuNhat(){}
    public ChuNhat(double r, double d){
        this.rong = r;
        this.dai = d;
    }

    public double getChuVi(){
        return (this.dai+this.rong)*2;
    }
    public double getDienTich(){
        return this.dai*this.rong;
    }
    public void xuat(){
        System.out.printf("Chiều rộng: %f \t Chiều dài: %f \t Chu vi: %f \t Diện tích: %f \n",this.rong,this.dai,this.getChuVi(),this.getDienTich());
    }
}
