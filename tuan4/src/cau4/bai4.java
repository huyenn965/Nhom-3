package cau4;
import java.util.Scanner;
public class bai4
{
	public static boolean ktrasnt (int n)
	{
		int i;
		if(n==1)
			return false;
		for(i=2;i<=Math.sqrt(n);i++) 
		{
			if(n%i==0)
				return false;
			}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n : ");
		int pt = sc.nextInt();
		if(ktrasnt(pt)) 
			System.out.println(pt + "  la so nguyen to ");
		else
			System.out.println(pt+ "  khong phai so nguyen to");
	}
	
}
