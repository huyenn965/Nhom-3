package bai3;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taikhoan currentAccount = null;

        // Dang nhap
        System.out.print("Nhap so tai khoan: ");
        String soTaikhoan = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        String matkhau = sc.nextLine();

        // Tao tai khoan moi neu chua ton tai
        System.out.println("Tai khoan khong ton tai. Vui long tao tai khoan moi.");
        System.out.println("Chon loai tai khoan: ");
        System.out.println("1. Tai Khoan Tiet Kiem");
        System.out.println("2. Tai Khoan Thanh Toan");
        System.out.print("Lua chon cua ban: ");
        int accountType = sc.nextInt();
        sc.nextLine();

        // Tao tai khoan moi dua tren lua chon
        System.out.print("Nhap ten chu tai khoan: ");
        String chuTaikhoan = sc.nextLine();
        System.out.print("Nhap so du ban dau: ");
        double soDu = sc.nextDouble();

        if (accountType == 1) {
            System.out.print("Nhap lai suat (%): ");
            double laiSuat = sc.nextDouble() / 100;
            currentAccount = new TaikhoanTietKiem(soTaikhoan, chuTaikhoan, matkhau, soDu, laiSuat);
            System.out.println("Da tao Tai Khoan Tiet Kiem thanh cong.");
        } else if (accountType == 2) {
            System.out.print("Nhap han muc no: ");
            double hanMucNo = sc.nextDouble();
            currentAccount = new TaikhoanThanhToan(soTaikhoan, chuTaikhoan, matkhau, soDu, hanMucNo);
            System.out.println("Da tao Tai Khoan Thanh Toan thanh cong.");
        } else {
            System.out.println("Lua chon khong hop le.");
            System.exit(0);
        }

        // Menu chuc nang
        int choice;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Menu Quan Ly Tai Khoan =====");
            System.out.println("1. Gui tien");
            System.out.println("2. Rut tien");
            if (currentAccount instanceof TaikhoanTietKiem) {
                System.out.println("3. Tinh lai (chi danh cho Tai Khoan Tiet Kiem)");
            }
            System.out.println("4. Xem so du");
            System.out.println("5. Doi mat khau");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so tien gui: ");
                    double soTienGui = sc.nextDouble();
                    currentAccount.guiTien(soTienGui);
                    break;

                case 2:
                    System.out.print("Nhap so tien rut: ");
                    double soTienRut = sc.nextDouble();
                    currentAccount.rutTien(soTienRut);
                    break;

                case 3:
                    if (currentAccount instanceof TaikhoanTietKiem) {
                        ((TaikhoanTietKiem) currentAccount).tinhLai();
                        System.out.println("So du sau khi tinh lai: " + currentAccount.kiemtrasodu());
                    } else {
                        System.out.println("Lua chon khong hop le cho loai tai khoan hien tai.");
                    }
                    break;

                case 4:
                    System.out.println("So du hien tai: " + currentAccount.kiemtrasodu());
                    break;

                case 5:
                    System.out.print("Nhap mat khau cu: ");
                    String matKhauCu = sc.nextLine();
                    System.out.print("Nhap mat khau moi: ");
                    String matKhauMoi = sc.nextLine();
                    if (currentAccount.doimatkhau(matKhauCu, matKhauMoi)) {
                        System.out.println("Doi mat khau thanh cong.");
                    } else {
                        System.out.println("Doi mat khau that bai.");
                    }
                    break;

                case 6:
                    System.out.println("Thoat chuong trinh.");
                    exit = true;
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        }

        sc.close();
    }
}
