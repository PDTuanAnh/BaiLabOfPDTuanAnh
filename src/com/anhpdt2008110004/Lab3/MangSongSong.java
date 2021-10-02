package com.anhpdt2008110004.Lab3;
/*
*    Nhập 2 mảng họ tên và điểm của sinh viên:
*   - Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực: 
*       Yếu: điểm < 5 
*       Trung bình: 5 <= điểm < 6.5 
*       Khá: 6.5 <= điểm < 7.5 
*       Giỏi: 7.5<= điểm < 9 
*       Xuất sắc: điểm >= 9 
*   - Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm.   
*/
import java.util.Scanner;

public class MangSongSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sinh viên cần thông tin: ");
        int n = scanner.nextInt();
        // Tạo mảng
        String[] thongTin = new String[n];// Tạo mảng thongTin có n phần tử
        for(int i = 0; i < n; i++){
            System.out.println("Nhập thông tin sinh viên thứ "+ (i+1) +":");
            System.out.print("Họ và tên: ");
        
            thongTin[i] = new Scanner(System.in).nextLine();
        }
        float[] diem = new float[n];// Tạo mảng diem có n phần tử
        for(int i = 0; i < n; i++){
            System.out.println("Nhập điểm của sinh viên thứ "+ (i+1) +":");
            System.out.print("Điểm: ");
            diem[i] = scanner.nextFloat();
        }
        for(int i = 0; i < n; i++) {
            if(diem[i] < 5) {
                System.out.println("\nTên: "+thongTin[i]+"\nĐiểm: "+diem[i]+"\nHọc lực: Yếu");
            }
            if(diem[i] >= 5 && diem[i] < 6.5) {
                System.out.println("\nTên: "+thongTin[i]+"\nĐiểm: "+diem[i]+"\nHọc lực: Trung bình");
            }
            if(diem[i] >= 6.5 && diem[i] < 7.5) {
                System.out.println("\nTên: "+thongTin[i]+"\nĐiểm: "+diem[i]+"\nHọc lực: Khá");
            }
            if(diem[i] >= 7.5 && diem[i] < 9) {
                System.out.println("\nTên: "+thongTin[i]+"\nĐiểm: "+diem[i]+"\nHọc lực: Giỏi");
            }
            if(diem[i ] >= 9) {
                System.out.println("\nTên: "+thongTin[i]+"\nĐiểm: "+diem[i]+"\nHọc lực: Xuất sắc");
            }
        }
        // Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
        String temp_ThongTin;
        float temp_Diem;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(diem[i] > diem[j])
                {
                    // Sắp xếp dữ liệu tăng dần cho mảng điểm
                    temp_Diem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp_Diem;
                    
                    // Sắp xếp dữ liệu tăng dần cho mảng thông tin sinh viên
                    temp_ThongTin = thongTin[i];
                    thongTin[i] = thongTin[j];
                    thongTin[j] = temp_ThongTin;
                }
            }
        }
        // In ra sau khi sắp xếp
        System.out.println("\nDanh sách các sinh viên đã sắp xếp theo điểm tăng dần:"); 
        for(int i = 0; i < n; i++){
            System.out.println("\nTên: "+thongTin[i]+"\nĐiểm: "+diem[i]);
        }
    }
}
