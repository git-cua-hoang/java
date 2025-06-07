package day4;

public class HinhTron extends HinhHoc {
    private int banKinh;
    public HinhTron(int banKinh ){
        this.banKinh = banKinh;
    }
    @Override
    public double tinhChuVi(){
        return Math.PI*2*banKinh;
    }
    @Override
    public double tinhDienTich(){
        return Math.PI*Math.pow(banKinh,2);
    }
}
