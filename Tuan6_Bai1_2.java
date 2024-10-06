/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan6_bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tuan6_Bai1_2 {
        private double CD;
        private double CR;
        public double getCD() {
            return CD;
        }

        public void setCD(double CD) {
            this.CD = CD;
        }

        public double getCR() {
            return CR;
        }

        public void setCR(double CR) {
            this.CR = CR;
        }
        public void Xuat(){
            System.out.println("Chieu dai: "+this.CD);
            System.out.println("Chieu rong: "+this.CR);
            System.out.println("Chu vi Hinh Chu Nhat: "+this.tinhChuVi());
            System.out.println("Dien Tich Hinh Chu Nhat: "+this.tinhDienTich());
        }

        public double tinhChuVi(){
            return  (this.CD + this.CR) * 2;
        }
        public double tinhDienTich(){
            return this.CD * this.CR;
        }
        public void Nhap(){
            Scanner scanner=new Scanner(System.in);
            System.out.print("Nhap canh A: ");
            this.CD=scanner.nextDouble();
            System.out.print("Nhap canh B: ");
            this.CR=scanner.nextDouble();
        }

}
