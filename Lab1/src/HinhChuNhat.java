/*
*   Nhập 2 cạnh của HCN, tính và xuất Chu vi, Diện tích, cạnh nhỏ nhất
*/
import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài của HCN: "); 
        double dai = scanner.nextDouble();
        System.out.print("Chiều rộng của HCN: "); 
        double rong = scanner.nextDouble();
        double chuVi = (dai+rong)*2;
        System.out.println("Chu vi của HCN: "+chuVi);
        double dienTich = dai*rong;
        System.out.println("Diện tích của HCN: "+dienTich);
        double canhNhoNhat = Math.min(dai, rong); 
        System.out.println("Cạnh nhỏ nhất của HCN: "+canhNhoNhat);
    }
}
