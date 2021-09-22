/*
*    Tổ chức một menu gồm 3 chức năng để gọi 3 bài trên và một chức năng để thoát 
*/
import java.util.Scanner;

public class CTrinhMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suLuaChon;
        do{
            System.out.println("O>>>>>>>>-----Welcom to Menu Program-----<<<<<<<<O");
            System.out.println("|>1. Giải Phương Trình Bậc 1: ax + b = 0.        |");
            System.out.println("|>2. Giải phương trình bâc 2: ax2 + bx + c = 0.  |");
            System.out.println("|>3. Tính số tiền điện của tháng.                |");
            System.out.println("|>4. Kết thúc menu.                              |");
            System.out.println("O>>>>>>>>--------------End---------------<<<<<<<<O");
            System.out.print("Chọn chức năng: ");
            suLuaChon = scanner.nextInt();
            switch (suLuaChon) {
                case 1:
                    System.out.println(">1. Giải Phương Trình Bậc 1: ax + b = 0.");
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
                    break;
                case 2:
                    System.out.println(">2. Giải phương trình bâc 2: qx2 + wx + e = 0.");
                    System.out.print("Nhập giá trị của q: ");
                    int q = scanner.nextInt();
                    System.out.print("Nhập giá trị của w: ");
                    int w = scanner.nextInt();
                    System.out.print("Nhập giá trị của e: ");
                    int e = scanner.nextInt();
                    double delta = Math.pow(w,2) - 4*q*e;
                    if(q == 0){
                        if(w == 0 && e == 0){
                            System.out.println("Phương trình vô số nghiệm");
                        }
                        else{
                            if(w == 0 && e != 0)
                                System.out.println("Phương trình vô nghiệm");
                        }  
                    }
                    else
                        if(delta < 0){
                            System.out.println("Phương trình vô nghiệm");
                        }else{
                            if (delta == 0) {
                                System.out.println("Phương trình có nghiệm kép x1 = x2 = "+(-w/2*q));
                            } else {
                                System.out.println("Phương trình có hai nghiệm phân biệt");
                                System.out.println("Nghiệm x1 = "+(-w+Math.sqrt(delta))/(2*q));
                                System.out.println("Nghiệm x2 = "+(-w-Math.sqrt(delta))/(2*q));
                            }
                        }
                case 3:
                    System.out.println(">3. Tính số tiền điện của tháng.");
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
                case 4: 
                    System.out.println("Kết thúc"); break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
                if(suLuaChon == 0){
                    System.out.println("Thanks For Using The Program! Goodbye And See You Later!");
                }
        }while(0 < suLuaChon && suLuaChon < 4); 
    }
}