/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitaikhoannganhang;
import java.util.Scanner;

/**
 *
 * @author admin
 */


public class TAIKHOAN {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau; 

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public TAIKHOAN(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Da gui " + soTien + ". So du hien tai: " + soDu);
        } else {
            System.out.println("So tien gui khong hop le.");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien + ". So du hien tai: " + soDu);
        } else {
            System.out.println("So tien rut khong hop le hoac so du khong du.");
        }
    }

    public double kiemTraSoDu() {
        return soDu;
    }

    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (matKhauCu.equals(matKhau)) {
            matKhau = matKhauMoi;
            System.out.println("Da doi mat khau thanh cong.");
        } else {
            System.out.println("Mat khau cu khong dung.");
        }
    } 

    public TAIKHOAN() {}

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tai khoan: ");
        this.soTaiKhoan = sc.nextLine();
        System.out.print("Nhap chu tai khoan: ");
        this.chuTaiKhoan = sc.nextLine();
        System.out.print("Nhap so du tai khoan: ");
        this.soDu = sc.nextDouble();
        sc.nextLine();  // Consume the newline
        System.out.print("Nhap mat khau: ");
        this.matKhau = sc.nextLine();
        // Close the scanner if it's not needed anymore
    }

    public void xuat() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + chuTaiKhoan);
        System.out.println("So du: " + soDu);
    }
}
