package bai3;

public class TaikhoanThanhToan extends Taikhoan {
    private double hanMucNo;

    public TaikhoanThanhToan(String STK, String tenchuTK, String matkhau, double sodu, double hanMucNo) {
        super(STK, tenchuTK, matkhau, sodu);
        this.hanMucNo = hanMucNo;
    }

    // Phuong thuc rut tien cho phep rut vuot han so du nhung khong qua han muc no
    @Override
    public void rutTien(double sotien) {
        if (sotien > 0 && sotien <= (sodu + hanMucNo)) {
            sodu -= sotien;
            System.out.println("Da rut: " + sotien + ". So du hien tai: " + sodu);
        } else {
            System.out.println("So tien rut vuot qua so du va han muc no cho phep.");
        }
    }
}
