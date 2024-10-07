package bai1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //khai báo
        Scanner sc = new Scanner(System.in);
        int a , b ;
        //nhập
        System.out.println("nhập vào 2 số dương bát kì");
        a = sc.nextInt();
        b=sc.nextInt();
        HinhChuNhat hcn = new HinhChuNhat(a,b) ;
        System.out.println("diện tích hình chữ nhất : " + hcn.dientich());
        System.out.println("cjhu vi hình chữ nhật : " + hcn.chuVi());
    }
}
