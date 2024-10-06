import java.util.Scanner;

public class Cau_3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        a =sc.nextInt();
        System.out.println("nhap vao b: ");
        b =sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int nhan = a * b;
        int chia = a / b;
        int du = a % b;
        System.out.println(a+ " + " +b+ " = "+tong);
        System.out.println(a+ " - " +b+ " = "+hieu);
        System.out.println(a+ " * " +b+ " = "+nhan);
        System.out.println(a+ " / " +b+ " = "+chia);
        System.out.println(a+ " % " +b+ " = "+du);
    }
}
