package com.anhpdt2008110004.Lab3;
/*
*    Bảng cửu chương
*/
import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Nhập một số nguyên để xuất bảng cửu chương: ");
        int x = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            {
                System.out.printf("%d x %d = %d", x, i, x * i);
                System.out.println();
            }
        }
    }
}
