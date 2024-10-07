import java.util.Scanner;

public class cau1_tuan4 {
    public static void main(String[] args) {
        int n;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            a = a + i;
        }
        System.out.println("tong: "+ a);

    }
    
}
