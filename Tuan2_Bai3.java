/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan2_bai3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan2_Bai3 {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        x = sc.nextInt();
        System.out.print("Nhap b: ");
        y = sc.nextInt();
        int tong = x + y;
        int hieu = x - y;
        int tich = x * y;
        int thuong = x / y;
        int du = x % y;
        System.out.println("Tong la: "+tong);
        System.out.println("Hieu la: "+hieu);
        System.out.println("Tich la: "+tich);
        System.out.println("Thuong la: "+thuong);
        System.out.println("Du la: "+du);
    }
}
