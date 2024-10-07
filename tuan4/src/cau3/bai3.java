package cau3 ;
import java.util.Scanner;
public class bai3 
{
	public static int giaithua(int n)
	{
		int i,gt;
		gt=1;
		for(i=1;i<=n;i++) 
			gt=gt*i;
		return gt;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap n : ");
		int n = sc.nextInt();
		int gthua= giaithua(n);
		System.out.println("giai thua cua "+ n +" la : "  +gthua);
	}

}

