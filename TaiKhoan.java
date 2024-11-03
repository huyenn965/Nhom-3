package com.mycompany.taikhoannganhang;

import java.util.Scanner;
import java.util.Random;

public class TaiKhoan {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau; 
    private String soDienThoai;

    private static final Scanner sc = new Scanner(System.in);

    public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, String matKhau, double soDu, String soDienThoai) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.matKhau = matKhau;
        this.soDienThoai = soDienThoai;
    }

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
        if (soDu >= 0) {
            this.soDu = soDu;
        } else {
            System.out.println("Số dư không thể âm.");
        }
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void guiTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Da gui " + soTien + ". So du hien tai: " + soDu);
        } else {
            System.out.println("So tien gui khong hop le.");
        }
    }
    
    public TaiKhoan(){
        super();
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Da rut " + soTien + ". So du hien tai: " + soDu);
        } else {
            System.out.println("So tien rut khong hop le hoac so du khong du.");
        }
    }

    public void doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (matKhauCu.equals(this.matKhau)) {
            this.matKhau = matKhauMoi;
            System.out.println("Doi mat khau thanh cong.");
        } else {
            System.out.println("Mat khau cu khong dung.");
            System.out.print("Ban co muon lay ma xac nhan (yes/no)? ");
            String traLoi = sc.nextLine();
            if (traLoi.equalsIgnoreCase("yes")) {
                String maXacNhan = guiMaXacNhan();
                System.out.print("Nhap ma xac nhan: ");
                String maNhap = sc.nextLine();
                if (maNhap.equals(maXacNhan)) {
                    this.matKhau = matKhauMoi;
                    System.out.println("Mat khau da duoc doi sau khi xac nhan.");
                } else {
                    System.out.println("Ma xac nhan khong dung.");
                }
            }
        }
    }

    public String guiMaXacNhan() {
        Random rand = new Random();
        int maXacNhan = rand.nextInt(999999);
        System.out.println("Ma xac nhan da gui den so dien thoai: " + soDienThoai + ": " + maXacNhan);
        return String.valueOf(maXacNhan);
    }

    public void nhap() {
        try {
            System.out.print("Nhap so tai khoan: ");
            this.soTaiKhoan = sc.nextLine();
            System.out.print("Nhap chu tai khoan: ");
            this.chuTaiKhoan = sc.nextLine();
            System.out.print("Nhap so du tai khoan: ");
            this.soDu = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhap mat khau: ");
            this.matKhau = sc.nextLine();
            System.out.print("Nhap so dien thoai: ");
            this.soDienThoai = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Da xay ra loi trong qua trinh nhap du lieu. Vui long kiem tra lai.");
            sc.next(); 
        }
    }

    public void xuat() {
        System.out.println("So tai khoan: " + soTaiKhoan);
        System.out.println("Chu tai khoan: " + chuTaiKhoan);
        System.out.println("So du: " + soDu);
        System.out.println("o dien thoai: " + soDienThoai);
    }

    public double kiemTraSoDu() {
        return this.soDu;
    }
}
