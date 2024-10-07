package cau2;
import java.util.Scanner;
public class bai2 
{
	public static void bangcuuchuong()
	{
		int i,j;
		for(i=1;i<=10;i++) 
		{ 
			System.out.println("bang cuu chuong  "+i+":");
			for(j=1;j<=10;j++) 
		System.out.println(i+ "x" +j+ "="+(i*j));		
							}
			System.out.println();
	}	
	public static void main(String[] args) 
	{
		bangcuuchuong();
	}

}
