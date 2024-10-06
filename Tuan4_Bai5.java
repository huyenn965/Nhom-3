/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan4_bai5;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan4_Bai5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a=sc.nextInt();
        System.out.print("Nhap b: ");
        int b=sc.nextInt();
        int r, ucln, bcnn;
        while(a%b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        ucln=b;
        bcnn=(a*b)/ucln;
        
        System.out.println("Uoc chung lon nhat la: "+ucln);
        System.out.println("Boi chung nho nhat la: "+bcnn);
    }
}
