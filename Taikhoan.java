package bai3;
public class Taikhoan {
	private String STK;
    private String tenchuTK;
    private String matkhau;
    private double sodu;
    public Taikhoan(String STK, String tenchuTK, String MK , double sodu)
    {
        this.STK = STK;
        this.tenchuTK = tenchuTK;
        this.sodu = sodu;
        this.matkhau = MK;
    }
    public void guiTien(double sotien) {
        if (sotien > 0) 
        {         
            sodu = sodu + sotien;
            System.out.println("Da gui: " + sotien + ". So du hien tai: " + sodu);         
        }
            else 
            System.out.println("So tien gui phai lon hon 0.");      
    }
    public void rutTien(double sotien) {
        if (sotien > 0 && sotien <= sodu) 
        { 
            sodu = sodu - sotien;
            System.out.println("Da rut: " + sotien + ". So du hien tai: " + sodu);
        }
        if (sotien > sodu)         
            System.out.println("So du khong du de rut: " + sotien);
        else 
            System.out.println("So tien rut phai lon hon 0.");        
    }
    public double kiemtrasodu() {
        return sodu;
    }
    public String getSTK() {
        return STK;
    }
    public String gettenchuTK() {
        return tenchuTK;
    }
    public boolean kiemtraMK(String nhapMK) {
        return this.matkhau.equals(nhapMK);
    }
    public boolean doimatkhau(String matkhaucu, String matkhaumoi) {
        if (this.matkhau.equals(matkhaucu)) {
            this.matkhau = matkhaumoi;
            System.out.println("Mat khau da duoc thay doi thanh cong.");
            return true;
        } 
        else 
        {
            System.out.println("Mat khau cu khong chinh xac.");
            return false;
        }
    }
 }
