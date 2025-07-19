package day5.repository;
import day5.entity.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienRepo {
    private List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
    public void themSV(SinhVien sinhVien){
        danhSachSinhVien.add(sinhVien);
    }
    public List<SinhVien> lietKeSV(){
        return danhSachSinhVien;
    }
    public SinhVien timSV(String maSinhVien){
        for(SinhVien sinhVien : danhSachSinhVien){
            if(sinhVien.getMaSinhVien().equals(maSinhVien)){
                return sinhVien;
            }
        }
        return null;
    }
    public void duoiHoc(SinhVien sinhVien){
        danhSachSinhVien.remove(sinhVien);
    }
    public boolean upDateSV(SinhVien sinhVien){
        SinhVien timSinhVien = timSV(sinhVien.getMaSinhVien());
        if(timSinhVien == null){
            return false;
        }
        timSinhVien.setTen(sinhVien.getTen());
        timSinhVien.setNamSinh(sinhVien.getNamSinh());
        timSinhVien.setGioiTinh(sinhVien.getGioiTinh());
        timSinhVien.setMaSoLop(sinhVien.getMaSoLop());
        return true;
    }

}
