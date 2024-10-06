/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan6_bai2;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan6_Bai2_2 {
    Scanner sc = new Scanner(System.in);
    protected String maSv;
    protected String hoTen;
    protected String ngaySinh;
    protected double diemTB;

    


    public String getmaSv() {
        return maSv;
    }

    public void setmaSv(String maSv) {
        this.maSv = maSv;
    }

    public String gethoTen() {
        return hoTen;
    }

    public void sethoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getngaySinh() {
        return ngaySinh;
    }

    public void setngaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getdiemTB() {
        return diemTB;
    }

    public void setdiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    public Tuan6_Bai2_2(String maSv, String hoTen, String ngaySinh, double diemTB) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
     
    
   public static Tuan6_Bai2_2 Nhap () {
       Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ma sinh vien : ");
        String maSV = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        double diemTB = scanner.nextDouble();
        scanner.nextLine(); 
        return new Tuan6_Bai2_2(maSV, ten, ngaySinh, diemTB);
    }
    public void Xuat() {
        System.out.println("ma sinh vien: " + maSv);
        System.out.println("ten sinh vien: " + hoTen);
        System.out.println("ngay sinh: " + ngaySinh);
        System.out.println("diem trung binh: " + diemTB);
    }
    
}


