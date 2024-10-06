import java.util.Scanner;

public class Cau_6_Tuan3 {
    public static void main(String[] args) {
        int a;
        int b;
        char n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        a = sc.nextInt();
        System.out.println("nhap so thu hai: ");
        b = sc.nextInt();
        System.out.println("nhap phep tinh: ");
        n = sc.next().charAt(0);
        switch (n) {
            case '+' : {
                System.out.println("vay ket qua la: " + (a + b));
                break;
            }
            case '-' : {
                System.out.println("vay ket qua la: " + (a - b));
                break;
            }
            case '*' : {
                System.out.println("vay ket qua la: " + (a * b));
                break;
            }
            case '/' : {
                System.out.println("vay ket qua la: " + (a / b));
                break;
            }
            default:
            System.out.println("vui long nhap lai ");
        }
    }
}
