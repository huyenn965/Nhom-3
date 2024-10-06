/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan6_bai2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author Admin
 */
public class Tuan6_bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tuan6_Bai2_2> dsSinhVien = new ArrayList<>();
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        
        System.out.println("Nhap thong tin sinh vien:");
        for (int i = 0; i < n; i++) {
            Tuan6_Bai2_2 sv = Tuan6_Bai2_2.Nhap();
            dsSinhVien.add(sv);
        }

        Collections.sort(dsSinhVien, new Comparator<Tuan6_Bai2_2>() {
            @Override
            public int compare(Tuan6_Bai2_2 sv1, Tuan6_Bai2_2 sv2) {
                return Double.compare(sv2.getdiemTB(), sv1.getdiemTB());
            }
        });

        System.out.println("Danh sach sau khi sap xep:");
        for (Tuan6_Bai2_2 sv : dsSinhVien) {
            sv.Xuat();
        }
    }
}