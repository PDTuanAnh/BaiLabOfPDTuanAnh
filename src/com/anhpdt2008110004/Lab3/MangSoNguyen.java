package com.anhpdt2008110004.Lab3;
/*
*    Nhập mảng số nguyên từ bàn phím:
*   - Sắp xếp và xuất mảng vừa nhập ra màn hình.
*   - Xuất phần tử có giá trị nhỏ nhất ra màn hình.
*   - Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3. 
*/
import java.util.Scanner;

public class MangSoNguyen {
    public static void main(String[] args) {
        int n, temp;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);
        
        // Khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        
        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        // sắp xếp theo thứ tự giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
            
        // Tìm phần tử nhỏ nhất
        // Sau khi sắp xếp theo thứ tự giảm dần 
        // Thì phần tử nhỏ nhất là phần tử cuối cùng trong mảng
        System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);

        // Tìm trung bình cộng
        float tong = 0, trungBinh;
        int soDem = 0;
        for(int i = 0; i < n; i++){
            if(array[i] %3 == 0){
                  tong += array[i];
                  soDem++;
            }
        }
        trungBinh = tong / soDem;
        System.out.println("Trung bình tổng các số chia hết cho 3 trong mảng là "+trungBinh);
    }
}