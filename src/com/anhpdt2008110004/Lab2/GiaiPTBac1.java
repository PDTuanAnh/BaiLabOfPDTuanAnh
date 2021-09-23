package com.anhpdt2008110004.Lab2;

/*
*   Giải phương trình bậc nhất trong đó các hệ số a, b nhập từ bàn phím
*/
import java.util.Scanner;

public class GiaiPTBac1 {
    public static void main(String[] args) {
        System.out.println("Giải Phương Trình Bậc 1: ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = scanner.nextInt();
        if(a == 0){
            if(b == 0)
                System.out.println("Phương trình vô số nghiệm");
            else
                System.out.println("Phương trình vô nghiệm");
        }
        else{
            double x = -b/a;
            System.out.println("Nghiệm của phương trình là x = "+x);
        }
    }
}
