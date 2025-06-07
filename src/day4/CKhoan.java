package day4;

public class CKhoan implements ThanhToan, TaiKhoan{
    @Override
    public void traTien(int soTien) {
        System.out.println("MoMo da nhan duoc "+soTien+" nghin dong");
    }
    @Override
    public void soDu(int soTien){
        int taiKhoan = soTien*2;
        System.out.println("so du tai khoan: "+taiKhoan);
    }
}
