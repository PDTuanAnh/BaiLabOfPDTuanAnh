package com.anhpdt2008110004.Lab2;

/*
*   Nhập vào số điện sử dụng của tháng và tính tiền điện theo phương pháp lũy tiến 
*/
import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số điện sử dụng của tháng (kW/h): ");
        double soDien = scanner.nextDouble();
        if (0 < soDien && soDien <= 50) {
            System.out.print("Tiền điện là "+(soDien*1000));
            System.out.println(" nghìn");
        } else {
            if(soDien > 50){
                System.out.print("Tiền điện là "+(50*1000+(soDien-50)*1200));
                System.out.println(" nghìn");
            }
            else
                System.out.println("Nhập sai số điện! -> Hãy nhập lại!");
        }
    }
}