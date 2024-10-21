package bai1;
public class HinhChuNhat {
    public double cd ;
    public double cr ;

    public HinhChuNhat(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    //xây dựng phương thức
    // tinh chu vi
    public double chuVi(){
        return 2*(cd + cr);
    }

    //tính diện tích
    public double dientich(){
        return cd * cr ;
    }

}
