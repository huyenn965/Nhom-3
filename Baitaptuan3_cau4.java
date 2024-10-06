/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitaptuan3_cau4;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Baitaptuan3_cau4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.print("nhap so a: ");
        int a= scanner.nextInt();
        System.out.print("nhap so b: ");
        int b = scanner.nextInt();
        System.out.print("nhap so c: ");
        int c = scanner.nextInt();
        int min = a;
        if(min>b)
        {
            min=b;
        }
        if(min>c)
        {
            min=c;
        }
        System.out.println("so nho nhat la: " + min);
    }
}
