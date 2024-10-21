/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cach2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String maSinhVien;
    private String ten;
    private String ngaySinh;
    private double diemTrungBinh;

    public SinhVien(String maSinhVien, String ten, String ngaySinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        this.maSinhVien = scanner.nextLine();
        System.out.print("Nhập tên: ");
        this.ten = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/mm/yyyy): ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        this.diemTrungBinh = scanner.nextDouble();
        scanner.nextLine();  // Clear buffer
    }

    public void in() {
        System.out.println("Mã sinh viên: " + this.maSinhVien);
        System.out.println("Tên: " + this.ten);
        System.out.println("Ngày sinh: " + this.ngaySinh);
        System.out.println("Điểm trung bình: " + this.diemTrungBinh);
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
}

