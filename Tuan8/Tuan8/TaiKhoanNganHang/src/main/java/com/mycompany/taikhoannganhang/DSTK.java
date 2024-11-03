package com.mycompany.taikhoannganhang;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DSTK {
    private static Map<String, TaiKhoan> danhSachTaiKhoan = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean chon = true;

        while (chon) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Dang ky tai khoan");
            System.out.println("2. Dang nhap tai khoan");
            System.out.println("3. Thoat");

            int luachon = nhapSoNguyen();

            switch (luachon) {
                case 1:
                    dangKyTaiKhoan(); 
                    break;
                case 2:
                    dangNhapTaiKhoan();
                    break;
                case 3:
                    chon = false;
                    break;
                default:
                    System.out.println("Chon so khong hop le. Moi chon so khac.");
            }
        }

        sc.close();
        System.out.println("Cam on ban da su dung dich vu.");
    }

    private static int nhapSoNguyen() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen hop le.");
            }
        }
    }

    private static void dangKyTaiKhoan() {
        TaiKhoan tk = new TaiKhoan();
        tk.nhap();

        if (danhSachTaiKhoan.containsKey(tk.getSoTaiKhoan())) {
            System.out.println("So tai khoan da ton tai. Vui long chon so khac.");
            return;
        }

        danhSachTaiKhoan.put(tk.getSoTaiKhoan(), tk);
        System.out.println("Dang ky tai khoan thanh cong!");
    }

    private static void dangNhapTaiKhoan() {
        System.out.print("Nhap so tai khoan: ");
        String soTaiKhoan = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        String matKhau = sc.nextLine();

        TaiKhoan tk = danhSachTaiKhoan.get(soTaiKhoan);

        if (tk != null && tk.getMatKhau().equals(matKhau)) {
            System.out.println("Dang nhap thanh cong!");
            chucNangTaiKhoan(tk);
        } else {
            System.out.println("So tai khoan hoac mat khau khong dung.");    
        }
    }

    private static void chucNangTaiKhoan(TaiKhoan tk) {
        boolean chon = true;

        while (chon) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Tao tai khoan tiet kiem");
            System.out.println("2. Tao tai khoan thanh toan");
            System.out.println("3. Thao tac voi tai khoan");
            System.out.println("4. Xem thong tin tai khoan");
            System.out.println("5. Thoat");

            int luachon = nhapSoNguyen();

            switch (luachon) {
                case 1:
                    taoTaiKhoanTietKiem(tk);
                    break;
                case 2:
                    taoTaiKhoanThanhToan(tk);
                    break;
                case 3:
                    thaoTacTaiKhoan(tk);
                    break;
                case 4:
                    tk.xuat(); 
                    break;
                case 5:
                    chon = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }

    private static void thaoTacTaiKhoan(TaiKhoan tk) {
        boolean chon = true;
        while (chon) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            System.out.println("3. Doi mat khau");
            System.out.println("4. Kiem tra so du");
            System.out.println("5. Thoat");

            int luachon = nhapSoNguyen();

            switch (luachon) {
                case 1:
                    System.out.print("Nhap so tien muon gui: ");
                    double tienGui = sc.nextDouble();
                    sc.nextLine(); 
                    tk.guiTien(tienGui);
                    break;
                case 2:
                    System.out.print("Nhap so tien muon rut: ");
                    double tienRut = sc.nextDouble();
                    sc.nextLine(); 
                    tk.rutTien(tienRut);
                    break;
                case 3:
                    System.out.print("Nhap mat khau cu: ");
                    String matKhauCu = sc.nextLine();
                    System.out.print("Nhap mat khau moi: ");
                    String matKhauMoi = sc.nextLine();
                    tk.doiMatKhau(matKhauCu, matKhauMoi);
                    break;
                case 4:
                    System.out.println("So du hien tai: " + tk.kiemTraSoDu());
                    break;
                case 5:
                    chon = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }

    private static void taoTaiKhoanTietKiem(TaiKhoan tk) {
        TaiKhoanTietKiem tkTietKiem = new TaiKhoanTietKiem(tk.getSoTaiKhoan(), tk.getChuTaiKhoan(), tk.getMatKhau(), tk.getSoDu(), tk.getSoDienThoai());

        tkTietKiem.nhap();

        double soDuToiThieu = 1000000; 
        if (tkTietKiem.kiemTraSoDuToiThieu(soDuToiThieu)) {
            System.out.println("So du dat muc toi thieu.");
        } else {
            System.out.println("So du chua dat muc toi thieu.");
        }

        double laiKep = tkTietKiem.tinhLaiKep(12);
        System.out.println("Lai kep sau 12 thang: " + laiKep);

        danhSachTaiKhoan.put(tkTietKiem.getSoTaiKhoan(), tkTietKiem);
        System.out.println("Tao tai khoan tiet kiem thanh cong!");
        tkTietKiem.xuat();
    }

    private static void taoTaiKhoanThanhToan(TaiKhoan tk) {
        System.out.print("Nhap so du: ");
        double soDu = sc.nextDouble();
        System.out.print("Nhap phi giao dich: ");
        double phiGiaoDich = sc.nextDouble();
        
        TaiKhoanThanhToan tkThanhToan = new TaiKhoanThanhToan(tk.getSoTaiKhoan(), tk.getChuTaiKhoan(), tk.getMatKhau(), soDu, tk.getSoDienThoai(), phiGiaoDich);
        tkThanhToan.setPhiGiaoDich(phiGiaoDich); 
        danhSachTaiKhoan.put(tkThanhToan.getSoTaiKhoan(), tkThanhToan);
        System.out.println("Tao tai khoan thanh toan thanh cong!");
        tkThanhToan.xuat();
    }
}
