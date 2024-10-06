/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thlthdttuan6_cau2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author admin
 */
class SinhVien {
    private String maSV;
    private String ten;
    private String ngaySinh;
    private double diemTB;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public double getdiemTB() {
        return diemTB;
    }

    public void setNamsinh(double diemTB) {
        this.diemTB = diemTB;
    }
    public SinhVien(String maSV, String ten, String ngaySinh, double diemTB) {
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    
    public static SinhVien Nhap (Scanner scanner) {
        System.out.print("nhap ma sinh vien : ");
        String maSV = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        double diemTB = scanner.nextDouble();
        scanner.nextLine(); 
        return new SinhVien(maSV, ten, ngaySinh, diemTB);
    }
    public void xuat() {
        System.out.println("ma sinh vien: " + maSV);
        System.out.println("ten sinh vien: " + ten);
        System.out.println("ngay sinh: " + ngaySinh);
        System.out.println("diem trung binh: " + diemTB);
    }
}