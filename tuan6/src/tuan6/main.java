package tuan6;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Nhap so tai khoan: ");
        String soTaikhoan = sc.nextLine();        
        System.out.print("Nhap chu tai khoan: ");
        String chuTaikhoan = sc.nextLine();        
        System.out.print("Nhap so du ban dau: ");
        double soDu = sc.nextDouble();
        Taikhoan taiKhoan = new Taikhoan(soTaikhoan, chuTaikhoan, soDu);        
        System.out.println("So tai khoan: " + taiKhoan.getSTK());
        System.out.println("Chu tai khoan: " + taiKhoan.gettenchuTK());
        System.out.println("So du ban dau: " + taiKhoan.kiemTrasodu());
        //nhap so tien gui
        System.out.print("Nhap so tien gui: ");
        double soTienGui = sc.nextDouble();
        //nhap so tien rut
        taiKhoan.guiTien(soTienGui);       
        System.out.print("Nhap so tien rut: ");
        double soTienRut = sc.nextDouble();
        //so du hien tai
        taiKhoan.rutTien(soTienRut);       
        System.out.println("So du cuoi cung: " + taiKhoan.kiemTrasodu());       
        sc.close();
    }
}
