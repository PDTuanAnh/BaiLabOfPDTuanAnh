package com.anhpdt2008110004.Lab2;

/*
*   Giải phương trình bậc hai trong đó các hệ số a, b và c nhập từ bàn phím
*/
import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bâc 2: ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị của a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị của b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập giá trị của c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b,2) - 4*a*c;
        if(a == 0){
            if(b == 0 && c == 0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else{
                if(b == 0 && c != 0)
                    System.out.println("Phương trình vô nghiệm");
            }  
        }
        else
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm");
            }else{
                if (delta == 0) {
                    System.out.println("Phương trình có nghiệm kép x1 = x2 = "+(-b/2*a));
                } else {
                    System.out.println("Phương trình có hai nghiệm phân biệt");
                    System.out.println("Nghiệm x1 = "+(-b+Math.sqrt(delta))/(2*a));
                    System.out.println("Nghiệm x2 = "+(-b-Math.sqrt(delta))/(2*a));
                }
            }
    }
}
