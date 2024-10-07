package cau1;
public class bai1 {
	public static int tinhtong(int n)
	{
		int i,s=0;
		for(i=1;i<=n;i++)
		s=s+i;
		return s;
	}
	public static void main(String[]args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("nhap so nguyen n : ");
		int n = sc.nextInt();
		int tong = tinhtong(n);
		System.out.println("Tong tu 1 toi "+ n +" la : "+tong);
	}
}
