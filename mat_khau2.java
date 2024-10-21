import java.util.Scanner;

public class mat_khau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tai khoan: ");
        int stk = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten tai khoan: ");
        String chutk = sc.nextLine();
        System.out.println("nhap mat khau: ");
        int mk = sc.nextInt();
        if (mk == 12345) {
            System.out.println("ten tai khoan: " + chutk);
            System.out.println("so tai khoan: " + stk);
            System.out.println("so du: 5000");
            System.out.println("nhap so tien gui: ");
            double tiengui = sc.nextDouble();
            System.out.println("nhap so tien rut: ");
            double tienrut = sc.nextDouble();
            mat_khau tk = new mat_khau(stk, chutk, 5000, tiengui, tienrut, mk);
            System.out.println("so tien sau khi gui trong tai khoan: " + tk.guiTien());
            System.out.println("so tien sau khi rut trong tai khoan: " + tk.kiemTra());
            tk.doimk(mk);
        } else {
            System.out.println("sai mat khau");
        }
    }
}
