package cau6 ;
import java.util.Scanner;
public class bai6 
{
	 public static boolean ktraso(int a) 
	 {
		    int b,c,d ; 
	        b = a;
	        c = 0;
	        while (a > 0) 
	        {
	                d = a % 10; 
	                c = c * 10 + d; 
	                a = a / 10;
	        }
	        return b == c;
	 }
    public static void main(String[] args) 
    {
    	int pt;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap so :  ");
        pt = sc.nextInt();
        if (ktraso(pt))        
            System.out.println(pt + " la so doi xung");
        else 
            System.out.println(pt + " la so khong doi xung");
    }
}
