package com.anhpdt2008110004.Lab8.Bai1;

public class Vuong extends ChuNhat{
    
    double canh;

    public Vuong(){
        super();
    }

	public Vuong(double c){
        super(c,c);
        this.canh = c;
    }

    @Override
    public void xuat() {
        System.out.printf("Cạnh: %f \t Chu vi: %f \t Diện tích: %f \n",this.canh,super.getChuVi(),super.getDienTich());
    }
}
