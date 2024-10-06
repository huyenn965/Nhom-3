/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thlthdttuan5_cau3;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class THLTHDTtuan5_cau3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("hap cac phan tu:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("cac phan tu sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
    

