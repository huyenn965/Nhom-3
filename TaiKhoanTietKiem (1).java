package com.mycompany.taikhoannganhang;

import java.util.Scanner;

public class TaiKhoanTietKiem extends TaiKhoan {
    private double laiSuat;

    public TaiKhoanTietKiem(String soTaiKhoan, String chuTaiKhoan, String matKhau, double soDu, String soDienThoai) {
        super(soTaiKhoan, chuTaiKhoan, matKhau, soDu, soDienThoai);
        this.laiSuat = laiSuat;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public double tinhLai(int soThang) {
        return (this.getSoDu() * laiSuat * soThang) / 1200;
    }

    public void guiTien(double soTien) {
        if (soTien <= 0) {
            System.out.println("So tien phai lon hin 0.");
            return;
        }
        super.guiTien(soTien);
        System.out.println("So tien da duoc gui vao tai khoan tiet kiem.");
    }
    
    @Override
     public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= kiemTraSoDu()) {
        } else {
            System.out.println("So tien rut khong hop le hoac so du khong du.");
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap so du: ");
            double soDu = sc.nextDouble();
            setSoDu(soDu);

            System.out.print("Nhap lai suat: ");
            double laiSuat = sc.nextDouble();
            setLaiSuat(laiSuat);
        } catch (Exception e) {
            System.out.println("Da xay ra loi trong luc nhap du lieu. Vui long kiem tra lai.");
            sc.next(); 
        }
    }

    public void xuat(int soThang) {
        super.xuat();
        System.out.println("Lai suat: " + laiSuat + "%");
        System.out.println("Lai sau " + soThang + " thang: " + tinhLai(soThang));
        System.out.println("Lai kep: " + tinhLaiKep(soThang));
    }

    public boolean kiemTraSoDuToiThieu(double soDuToiThieu) {
        return this.getSoDu() >= soDuToiThieu;
    }

    public double tinhLaiKep(int soThang) {
        double lai = this.getSoDu();
        for (int i = 0; i < soThang; i++) {
            lai = lai * (1 + laiSuat / 1200);
        }
        return lai - this.getSoDu();
    }
}
