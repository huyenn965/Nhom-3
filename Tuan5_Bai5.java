/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan5_bai5;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan5_Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.print("Danh sach cac so: ");
        for (int number : a) {
            System.out.print(number + " ");
        }
    }
}
