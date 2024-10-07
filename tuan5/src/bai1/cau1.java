package bai1;
import java.util.Scanner;
public class cau1{
	public static int[] nhapmang() 
	{
        Scanner sc = new Scanner(System.in);       
        System.out.print("Nhap so pt");
        int n = sc.nextInt();        
        int[] a = new int[n];       
        System.out.println("nhap cac pt");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Phần tử " + (i+1) + ": ");
            a[i] = sc.nextInt(); 
        }
            return a;
    }
	public static int congmang(int[] a) 
	{
        int tong ;
        tong = 0 ;
        for (int n: a) {
            tong = tong + n;
        }
        return tong;
    }
	 public static void main(String[] args) 
	 {
	        int[] a= nhapmang();
	        int tong = congmang(a);
	        System.out.println("Tổng các phần tử trong mảng là: " + tong);
	 }
}
