package day5.service;
import day5.entity.SinhVien;
import day5.repository.SinhVienRepo;
import java.util.List;

public class SinhVienService {
    private SinhVienRepo svRepo;

    public SinhVienService(SinhVienRepo repo){
        this.svRepo = repo;
    }

    public boolean boSungSV(String ten, int namSinh, String gioiTinh, String maSinhVien, String maSoLop ){
        if(ten == null || namSinh <=0 || gioiTinh == null || maSinhVien == null || maSoLop == null)
            return false;
        SinhVien timSV = svRepo.timSV(maSinhVien);
        if(timSV != null) return false;
        SinhVien sinhVien = new SinhVien(ten, namSinh, gioiTinh, maSinhVien, maSoLop);
        svRepo.themSV(sinhVien);
        return true;

    }
    public boolean capNhatSV(String ten, int namSinh, String gioiTinh, String maSinhVien, String maSoLop){
        SinhVien sinhVien = new SinhVien(ten,namSinh,gioiTinh,maSinhVien,maSoLop);
        return svRepo.upDateSV(sinhVien);
    }
    public List<SinhVien> listSinhVien(){
        return svRepo.lietKeSV();
    }
    public SinhVien timSV(String maSinhVien){
        return svRepo.timSV(maSinhVien);
    }
    public void xoaSV(String maSinhVien){
        SinhVien sinhVien = svRepo.timSV(maSinhVien);
        if(sinhVien != null){
            svRepo.duoiHoc(sinhVien);
        }
    }

}
