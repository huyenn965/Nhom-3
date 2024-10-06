import java.util.Scanner;

public class Tuan2_Cau4 {
    public static void main(String[] args) {
        int tiengui;
        int lai;
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so tien gui: ");
        tiengui = sc.nextInt();
        System.out.println("nhap lai suat ngan hang: ");
        lai = sc.nextInt();
        System.out.println("nhap vao so thang gui: ");
        thang = sc.nextInt();
        double a = (tiengui * lai) / 100.0;
        double b = a * thang;
        double tiengoc = tiengui + b;
        System.out.println("so tien lai la: " + b);
        System.out.println("so tien goc cuoi ki la: " + tiengoc);
    }
}
