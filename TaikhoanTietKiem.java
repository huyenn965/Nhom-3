package bai3;

public class TaikhoanTietKiem extends Taikhoan {
    private double laiSuat;

    public TaikhoanTietKiem(String STK, String tenchuTK, String matkhau, double sodu, double laiSuat) {
        super(STK, tenchuTK, matkhau, sodu);
        this.laiSuat = laiSuat;
    }

    // Phuong thuc tinh lai danh rieng cho TaiKhoanTietKiem
    public void tinhLai() {
        sodu += sodu * laiSuat;
        System.out.println("So du sau khi tinh lai: " + sodu);
    }

    // Phuong thuc rut tien chi cho phep rut neu du so du
    @Override
    public void rutTien(double sotien) {
        if (sotien > 0 && sotien <= sodu) {
            sodu -= sotien;
            System.out.println("Da rut: " + sotien + ". So du hien tai: " + sodu);
        } else {
            System.out.println("So tien rut phai lon hon 0 va khong vuot qua so du hien co.");
        }
    }
}
