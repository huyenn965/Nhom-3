/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitaptuan3_cau5;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Baitaptuan3_cau5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap canh a: ");
        double a = scanner.nextDouble();
        System.out.print(" nhap canh b: ");
        double b = scanner.nextDouble();
        System.out.print(" nhap canh c: ");
        double c = scanner.nextDouble();
        if(a+b>c && a+c>b && b+c>a)
        {
          System.out.println("ba canh tao thanh tam giac");
            if(a==b && b==c)
            {
               System.out.println("ba canh tao thanh tam giac deu"); 
            }
            else
               if(a==b||a==c||b==c)
            {
               System.out.println("la tam giac cân");   
            }
            else
               if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a)
            {
               System.out.println("la tam giac vuong");   
            }  
            else 
            {
                System.out.println("la tam giac thuong");   
            }
        }
        else 
            {
                System.out.println("ba canh khong tao thanh tam giac");      
            }
    }
}