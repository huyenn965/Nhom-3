package bai3;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
    	// tinh dong goi la dung private de bao mat thong tin thay vi dung 
    	//public de truy cap o bat cu dau
    	//dung private phai co public Taikhoan(String STK, String tenchuTK, double sodu)
            //this.STK = STK;
            //this.tenchuTK = tenchuTK;
            //this.sodu = sodu;
        Scanner sc = new Scanner(System.in);        
        System.out.print("Nhap so tai khoan: ");
        String soTaikhoan = sc.nextLine();
        String matkhau = "12345678";
        System.out.print("Nhap chu tai khoan: ");
        String chuTaikhoan = sc.nextLine();
        System.out.print("Nhap so du ban dau: ");
        double soDu = sc.nextDouble();
        Taikhoan taiKhoan = new Taikhoan(soTaikhoan, chuTaikhoan,  matkhau , soDu); 
        sc.nextLine(); 
        System.out.print("Nhap mat khau de truy cap tai khoan: ");
        String nhapMK = sc.nextLine();
        if (taiKhoan.kiemtraMK(nhapMK))
            System.out.println("Dang nhap thanh cong.");
        else 
        {
            System.out.println("Mat khau sai.");
            System.exit(0);
        }      
        System.out.println("So tai khoan: " + taiKhoan.getSTK());
        System.out.println("Chu tai khoan: " + taiKhoan.gettenchuTK());
        System.out.println("So du ban dau: " + taiKhoan.kiemtrasodu());
        //nhap so tien gui
        System.out.print("Nhap so tien gui: ");
        double soTienGui = sc.nextDouble();
        //nhap so tien rut
        taiKhoan.guiTien(soTienGui);       
        System.out.print("Nhap so tien rut: ");
        double soTienRut = sc.nextDouble();
        //so du hien tai
        taiKhoan.rutTien(soTienRut);       
        System.out.println("So du cuoi cung: " + taiKhoan.kiemtrasodu());       
        sc.nextLine();
        System.out.print("Nhap mat khau cu de doi: ");
        String matkhaucu = sc.nextLine();
        System.out.print("Nhap mat khau moi: ");
        String matkhaumoi = sc.nextLine();
        if (taiKhoan.doimatkhau(matkhaucu, matkhaumoi))        
            System.out.println("Doi mat khau thanh cong.");
        else
            System.out.println("Doi mat khau that bai.");
        sc.close();
    }
}
