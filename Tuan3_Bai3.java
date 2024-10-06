/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan3_bai3;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan3_Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if(d>0)
        {
            double x1 = (-b + Math.sqrt(d))/(2 * a);
            double x2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else
        {
            if(d==0)
            {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            }
            else
                System.out.println("Phuong trinh vo nghiem.");

        }
    }
}
