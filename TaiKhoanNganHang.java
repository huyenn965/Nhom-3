package com.mycompany.taikhoannganhang;
import java.util.Scanner;

public class TaiKhoanNganHang {

    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan();
        tk.nhap();
        tk.xuat();
        
        Scanner sc = new Scanner(System.in);
        boolean chon = true;

        while (chon) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Doi mat khau");
            System.out.println("4. Kiem tra so du");
            System.out.println("5. Thoat");

            int luachon = sc.nextInt();

            switch (luachon) {
                case 1:
                    System.out.print("Nhap so tien muon gui: ");
                    double tienGui = sc.nextDouble();
                    tk.guiTien(tienGui);
                    break;
                case 2:
                    System.out.print("Nhap so tien muon rut: ");
                    double tienRut = sc.nextDouble();
                    tk.rutTien(tienRut);
                    break;
                case 3:
                    System.out.print("Nhap mat khau cu: ");
                    String matKhauCu = sc.next();
                    System.out.print("Nhap mat khau moi: ");
                    String matKhauMoi = sc.next();
                    tk.doiMatKhau(matKhauCu, matKhauMoi);
                    break;
                case 4:
                    System.out.println("\nSo du hien tai: " + tk.kiemTraSoDu());
                    break;
                case 5:
                    chon = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
            tk.xuat();  // Display account details after each transaction
        }

        sc.close();  // Close the scanner
        System.out.println("Cam on ban da su dung dich vu.");
    }
}
