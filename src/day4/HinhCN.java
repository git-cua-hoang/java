package day4;

public class HinhCN extends HinhHoc{
    private double dai, rong;
    public HinhCN(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }
    public double getDai() {
        return dai;
    }
    public double getRong(){
        return rong;
    }
    @Override
    public double tinhDienTich(){
        return dai*rong;
    }
    @Override
    public double tinhChuVi(){
        return 2*(dai+rong);
    }

}
