import java.util.Scanner;

/*
*   Nhập các hệ số của PT bậc 2, tính và xuất delta  
*/

public class Delta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị của a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập giá trị của b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập giá trị của c: ");
        int c = scanner.nextInt();
        double delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Giá trị của delta là "+delta);
    }
}
