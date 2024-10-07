import java.util.Scanner;

public class cau_1_Tuan3 {
    public static void main(String[] args) {
        Double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so: ");
        a = sc.nextDouble();
        if (a>0) {
            System.out.println(a+ " la so duong");
        } else {
            if (a==0) {
                System.out.println(a + " bang khong");
            } else {
                if (a<0) {
                    System.out.println(a+ " la so am");
                }
            }
        }
    }
}
