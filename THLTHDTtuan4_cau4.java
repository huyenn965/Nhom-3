/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thlthdttuan4_cau4;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class THLTHDTtuan4_cau4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so nguyen n: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " khong phai la so nguyen to");
                    isPrime = false;
                    break; 
                }
            }
            if (isPrime) {
                System.out.println(n + " la so nguyen to.");
            }
        }

        scanner.close();
    }
}
