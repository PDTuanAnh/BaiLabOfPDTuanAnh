package com.anhpdt2008110004.Lab3;
/*
*    Nhập số nguyên từ bàn phím và kiểm tra có phải là số nguyên tố không!
*/
import java.util.Scanner;

public class KTraSoNgTo {
    // Hàm kiểm tra n có phải số nguyên tố hay không
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
}
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n = ");
        int n = scanner.nextInt();
        if(isPrime(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }
        scanner.close();
    }
}
