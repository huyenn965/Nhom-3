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
public class DanhSachSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Clear buffer

        SinhVien[] danhSach = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
            SinhVien sv = new SinhVien("", "", "", 0);
            sv.nhap();
            danhSach[i] = sv;
        }

        System.out.println("\nThông tin sinh viên:");
        for (SinhVien sv : danhSach) {
            sv.in();
        }

        // Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
        for (int i = 0; i < danhSach.length - 1; i++) {
            for (int j = i + 1; j < danhSach.length; j++) {
                if (danhSach[i].getDiemTrungBinh() < danhSach[j].getDiemTrungBinh()) {
                    SinhVien temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }

        System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình giảm dần:");
        for (SinhVien sv : danhSach) {
            sv.in();
        }
    }
}
