package bai3;
import java.util.Scanner;
public class Taikhoan {
    private String STK;
    private String tenchuTK;
    private double sodu;
    public Taikhoan(String STK, String tenchuTK, double sodu) {
        this.STK = STK;
        this.tenchuTK = tenchuTK;
        this.sodu = sodu;
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
    public double kiemTrasodu() {
        return sodu;
    }
    public String getSTK() {
        return STK;
    }
    public String gettenchuTK() {
        return tenchuTK;
    }
 }
