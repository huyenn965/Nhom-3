/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class THLTHDTtuan6_cau2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        System.out.print("Nhap so luong sinh vien: ");
        int soSV = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < soSV; i++) {
            System.out.println("Nhap thong tin sinh vien:");
            SinhVien sv = SinhVien.Nhap(scanner);
            dsSinhVien.add(sv);
        }
        Collections.sort(dsSinhVien, new Comparator<SinhVien>() {
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getdiemTB(), sv1.getdiemTB());
            }
        });
        System.out.println("danh sach sinh vien sau khi sap xep diem:");
        for (SinhVien sv : dsSinhVien) {
            sv.xuat();
       
        }
    }
}
