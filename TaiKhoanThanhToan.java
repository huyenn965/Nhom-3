package com.mycompany.taikhoannganhang;

public class TaiKhoanThanhToan extends TaiKhoan {
    private double phiGiaoDich;

    public double getPhiGiaoDich() {
        return phiGiaoDich;
    }

    public void setPhiGiaoDich(double phiGiaoDich) {
        this.phiGiaoDich = phiGiaoDich;
    }

    public TaiKhoanThanhToan(String soTaiKhoan, String chuTaiKhoan, String matKhau, double soDu, String soDienThoai, double phiGiaoDich) {
        super(soTaiKhoan, chuTaiKhoan, matKhau, soDu, soDienThoai);
        this.phiGiaoDich = phiGiaoDich;
    }

    public void thucHienGiaoDich(double soTien) {
        double tongSoTienCanRut = soTien + phiGiaoDich;
        if (tongSoTienCanRut <= getSoDu()) {
            rutTien(tongSoTienCanRut);
            System.out.println("Giao dich thanh cong.\nPhi giao dich: " + phiGiaoDich + " VNĐ.");
        } else {
            System.out.println("So du khong du de thuc hien giao dich.");
        }
    }

    @Override
    public void rutTien(double soTien) {
        super.rutTien(soTien);
        System.out.println("So tien da duoc rut tu tai khoan.");
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("So du: " + this.getSoDu());
        System.out.println("Phi giao dich: " + this.phiGiaoDich);
    }         
}
