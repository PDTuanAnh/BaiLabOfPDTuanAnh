package com.anhpdt2008110004.Lab1;

/*
*   Nhập cạnh của khối lập phương, tính và xuất thể tích  
*/
import java.util.Scanner;

public class KhoiLapPhuong {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước cạnh của khối lập phương: ");
        int canh = scanner.nextInt();
        int theTich = canh*canh*canh;
        System.out.println("Thể tích của khối lập phương: "+theTich);
    }
}