/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thlthdttuan5_cau5;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class THLTHDTtuan5_cau5 {

    public static void main(String[] args) {
        ArrayList<Integer> danhSach = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int so = scanner.nextInt();
            danhSach.add(so);
        }
        System.out.println("Cac phan tu trong danh sach: ");
        for (int so : danhSach) {
            System.out.println(so);
        }

        scanner.close();
    }    }

