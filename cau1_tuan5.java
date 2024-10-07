import java.util.Scanner;

public class cau1_tuan5 {
    public static void main(String[] args) {
        int n;
        int x = 0;
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang: ");
        n = sc.nextInt();
        while (n != 0) {
            m = n % 10;
            x = m + x ;
            n = n / 10;
        }
        System.out.println("dap an la: "+ x);
    }
}
