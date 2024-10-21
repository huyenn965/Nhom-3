package bai2;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo 1 mảng để lưu sinh viên
        ArrayList<SinhVien> danhsachsinhvien = new ArrayList<>();
        // khởi tạo biến để lưu số lượng sinh viên
        int soLuongSinhVien ;
        //nhập số lượng sinh viên
        System.out.print("nhập số lượng sinh viên :");
        soLuongSinhVien = sc.nextInt();
        sc.nextLine(); // Xóa bộ đệm
        //nhập thông tin cho từng sinh viên
        for(int i = 0 ;i<soLuongSinhVien; i++){
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            SinhVien sv= new SinhVien("","","",0.0);
            sv.nhap();
            danhsachsinhvien.add(sv);
        }
        for(int i = 0 ; i<soLuongSinhVien-1 ; i++){
            for(int j = i+1 ; j<soLuongSinhVien ; j++){
                if(danhsachsinhvien.get(j).diemTrungBinh() > danhsachsinhvien.get(i).diemTrungBinh()){
                    // đổi 2 sinh vien
                    SinhVien bienphu = danhsachsinhvien.get(i);
                    danhsachsinhvien.set(i , danhsachsinhvien.get(j));
                    danhsachsinhvien.set(j,bienphu);
                }
            }
        }
        System.out.println("\nDanh sách sinh viên theo điểm trung bình giảm dần:");
        for (SinhVien sv : danhsachsinhvien) {
            sv.inThongTin();
            System.out.println("\n-----------------------\n");
        }
    }
}
