/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thlthdttuan6_cau1;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class HINHCHUNHAT {
    public static int count;
    private double CD;
    private double CR;
   
    
       public double getCD() {
        return CD;
    }

    public void setCD(double CD) {
        this.CD= CD;
    }

    public double getCR() {
        return CR;
    }

    public void setCR(double CR) {
        this.CR = CR;
    }
    public HINHCHUNHAT (){
        count++;
    }

    public HINHCHUNHAT(double CD, double CR) {
        this.CD= CD;
        this.CR = CR;
        
    }
    public void Xuat(){
       System.out.println("Canh A:"+this.CD);
       System.out.println("Canh B:"+this.CR);
       System.out.println("Chu vi hinh chu nhat la: "+this.tinhChuVi());
       System.out.println("Dien tich hinh chu nhat la: "+this.tinhDienTich());
   }
    public double tinhChuVi(){
    return this.CD+this.CD+this.CR+this.CR ;
}
    public double tinhDienTich(){
    double P = this.tinhChuVi()/2;
    return CD*CR;
}
    public void Nhap(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap chieu dai: ");
    this.CD=sc.nextDouble();
    System.out.print("Nhap chieu rong: ");
    this.CR=sc.nextDouble();
    
} 
}
