/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thlthdttuan4_cau5;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class THLTHDTtuan4_cau5 {
    public static int timUCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return timUCLN(b, a % b);
    }
    public static int timBCNN(int a, int b) {
        return (a * b) / timUCLN(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = scanner.nextInt();
        int ucln = timUCLN(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + ucln);
        int bcnn = timBCNN(a, b);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b+" là:" + bcnn);

        scanner.close();
    }    }

