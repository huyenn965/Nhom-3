/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitaikhoannganhang;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Baitaikhoannganhang {

    public static void main(String[] args) {
        TAIKHOAN t = new TAIKHOAN();
        t.nhap();
        t.xuat();
        
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
                    t.guiTien(tienGui);
                    break;
                case 2:
                    System.out.print("Nhap so tien muon rut: ");
                    double tienRut = sc.nextDouble();
                    t.rutTien(tienRut);
                    break;
                case 3:
                    System.out.print("Nhap mat khau cu: ");
                    String matKhauCu = sc.next();
                    System.out.print("Nhap mat khau moi: ");
                    String matKhauMoi = sc.next();
                    t.doiMatKhau(matKhauCu, matKhauMoi);
                    break;
                case 4:
                    System.out.println("\nSo du hien tai: " + t.kiemTraSoDu());
                    break;
                case 5:
                    chon = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
            t.xuat();  
        }

        sc.close();  
        System.out.println("Cam on ban da su dung dich vu.");
    }
}


