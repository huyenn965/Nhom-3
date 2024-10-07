import java.util.Scanner;

public class HinhChuNhat {
    private Double chieudai;
    private Double chieurong;
    public HinhChuNhat(Double chieudai, Double chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public double dientich(){
        return this.chieudai * this.chieurong;
    }
    public double chuvi(){
        return (this.chieudai + this.chieurong) * 2;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai: ");
        double chieudai = sc.nextDouble();
        System.out.println("chieu rong: ");
        double chieurong = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(chieudai, chieurong);
        System.out.println("chu vi la: " + hcn.chuvi());
        System.out.println("dien tich la: " + hcn.dientich());
        
    }
}
