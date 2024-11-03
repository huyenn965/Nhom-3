package bai3;

public abstract class Taikhoan {
    protected String STK;
    protected String tenchuTK;
    protected String matkhau;
    protected double sodu;

    public Taikhoan(String STK, String tenchuTK, String matkhau, double sodu) {
        this.STK = STK;
        this.tenchuTK = tenchuTK;
        this.matkhau = matkhau;
        this.sodu = sodu;
    }

    // Phuong thuc gui tien
    public void guiTien(double sotien) {
        if (sotien > 0) {
            sodu += sotien;
            System.out.println("Da gui: " + sotien + ". So du hien tai: " + sodu);
        } else {
            System.out.println("So tien gui phai lon hon 0.");
        }
    }

    // Phuong thuc kiem tra so du
    public double kiemtrasodu() {
        return sodu;
    }

    // Phuong thuc truu tuong rut tien
    public abstract void rutTien(double sotien);

    // Cac phuong thuc kiem tra va doi mat khau
    public boolean kiemtraMK(String nhapMK) {
        return this.matkhau.equals(nhapMK);
    }

    public boolean doimatkhau(String matkhaucu, String matkhaumoi) {
        if (this.matkhau.equals(matkhaucu)) {
            this.matkhau = matkhaumoi;
            System.out.println("Mat khau da duoc thay doi thanh cong.");
            return true;
        } else {
            System.out.println("Mat khau cu khong chinh xac.");
            return false;
        }
    }

    public String getSTK() {
        return STK;
    }

    public String gettenchuTK() {
        return tenchuTK;
    }
}
