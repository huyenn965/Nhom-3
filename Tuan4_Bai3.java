/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan4_bai3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan4_Bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();

        long gt=1;
        if(n<0)
            System.out.println("Nhap so nguyen duong.");
        else{
            for (int i=1;i<=n;i++)
                gt=gt*i;
            System.out.println("Giai thua cua n la: "+gt);
        }
    }
}
