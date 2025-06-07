package day4;

public abstract class HinhHoc {
//    int soCanh; Vi abstract class ko tao duoc object, nen atrribute khai bao duoc, nhung vo nghia
//    int soDinh;

    public abstract double tinhDienTich();

    public abstract double tinhChuVi();

    public void thongBao(String hinh){
        System.out.println("day la hinh "+hinh);
    }
}
