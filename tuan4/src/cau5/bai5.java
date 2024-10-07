package cau5;
import java.util.Scanner;
public class bai5 
{
	public static int ucln(int a, int b) 
	{
		int r ;
        while (b != 0) 
        {
        	 r = a % b ;
             a = b;
             b = r;
         }
         return a;
    }
	public static int bcnn(int a, int b) 
	{
        return (a * b) / ucln(a, b);
    }
	public static void main(String[] args) 
	{
		int a,b,uc,bc;
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap a ");
        a = sc.nextInt();
        System.out.print("nhap b ");
        b = sc.nextInt();
        uc = ucln(a, b);
        bc= bcnn(a, b);
        System.out.println("Uoc chung lon nhat la : " + uc);
        System.out.println("Boi chung nho nhat la : " + bc);
    }
}
