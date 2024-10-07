package bai4;
import java.util.Scanner;
public class cau4 {   
    public static int[] Nhapmang() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt(); 
        int[] a = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) 
        { 
            System.out.print("Phần tử " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        return a;
    }
    public static int timpt(int[] a) 
    {
        int max = 0, ptumax = a[0];
        for (int so : a) 
        {
            int soptu = 0;
            for (int j : a) 
                if (so == j) soptu++;
            if (soptu > max) 
            {
                max = soptu;
                ptumax = so;
            }
        }       
        return ptumax;
    }
    public static void main(String[] args) 
    {
        int[] a = Nhapmang(); 
        int ptuxuathien = timpt(a); 
        System.out.println("Phần tử xuất hiện nhiều nhất là: " + ptuxuathien);
    }
}
