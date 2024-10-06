package tuan3;

import java.util.Scanner;

public class Cau2_Tuan_3 {
    public static double nhapDiem() {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình của học sinh: ");
        return sc.nextDouble();
    }
    public static String xepLoai(double dtb) {
        if (dtb >= 8.0) {
            return "Giỏi";
        } else if (dtb >= 6.5) {
            return "Khá";
        } else if (dtb >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
    public static void main(String[] args) 
    {
        double dtb = nhapDiem();
        String loai = xepLoai(dtb);
        System.out.println("Xếp loại học sinh: " +loai);
    }
}