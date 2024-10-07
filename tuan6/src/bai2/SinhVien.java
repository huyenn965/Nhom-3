package bai2;
import java.util.Scanner;
public class SinhVien {
    private String maSV ;
    private String ten ;
    private String ngaySinh;
    private double dtb ;
    public SinhVien(String maSV, String ten, String ngaySinh, double dtb) {
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }
    public void nhap (){
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập mã sinh vien: ");
        this.maSV = sc.nextLine();

        System.out.print("nhập tên sinh viên : ");
        this.ten = sc.nextLine();

        System.out.print("nhập ngày sinh : ");
        this.ngaySinh = sc.nextLine();

        System.out.print("nhập điểm trung bình : ");
        String dtbInput = sc.nextLine();
        // Thay thế dấu phẩy bằng dấu chấm
        dtbInput = dtbInput.replace(',', '.');
        this.dtb = Double.parseDouble(dtbInput); // Chuyển đổi thành double

        System.out.println("\n-------------------------------\n");
    }
    public void inThongTin(){
        System.out.print(" mã sinh viên : " + this.maSV);
        System.out.printf(" Tên sinh viên : " + this.ten);
        System.out.printf(" Ngày sinh : " + this.ngaySinh);
        System.out.printf(" điểm trung bình : " + this.dtb);
    }
    // phương thức lấy  điểm
    public double diemTrungBinh(){
        return this.dtb ;
    }
}
