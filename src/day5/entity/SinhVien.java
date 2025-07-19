package day5.entity;

public class SinhVien {
//    Tên, năm sinh, giới tính, mã số lớp, ma sinh vien
    private String ten;
    private int namSinh;
    private String gioiTinh;
    private String maSinhVien;
    private String maSoLop;

    public SinhVien(String ten, int namSinh, String gioiTinh, String maSinhVien, String maSoLop) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.maSinhVien = maSinhVien;
        this.maSoLop = maSoLop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getMaSoLop() {
        return maSoLop;
    }

    public void setMaSoLop(String maSoLop) {
        this.maSoLop = maSoLop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", maSoLop='" + maSoLop + '\'' +
                '}';
    }
}
