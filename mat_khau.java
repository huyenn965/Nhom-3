import java.util.Scanner;

public class mat_khau {
    private int stk;
    private String chutk;
    private double sodu;
    private double tiengui;
    private double tienrut;
    private int mk;

    public mat_khau(int stk, String chutk, double sodu, double tiengui, double tienrut, int mk) {
        this.stk = stk;
        this.chutk = chutk;
        this.sodu = sodu;
        this.tiengui = tiengui;
        this.tienrut = tienrut;
        this.mk = mk;
    }

    public double guiTien() {
        this.sodu += this.tiengui;
        return this.sodu;
    }

    public double kiemTra() {
        return this.sodu - this.tienrut;
    }
    
    public void doimk(int mk2){
        Scanner dmk = new Scanner(System.in);
        System.out.println("nhao mat khau moi: ");
        mk2 = dmk.nextInt();
        this.mk = mk2;
        System.out.println("doi mat khau thanh cong");
    }
}