package day5.view;

import day5.entity.LopHoc;
import day5.entity.SinhVien;
import day5.service.SinhVienService;

import java.util.List;
import java.util.Scanner;

public class SinhVienView {
    private SinhVienService sinhVienService;
    private Scanner scanner;

    public SinhVienView(SinhVienService sinhVienService){
        this.sinhVienService = sinhVienService;
        this.scanner = new Scanner(System.in);
    }
    public void start(){
        int choice = 0;
        do{
            System.out.println("Quan ly Sinh Vien");
            System.out.println("1. Bo sung Sinh Vien");
            System.out.println("2. Cap nhat Sinh Vien");
            System.out.println("3. List Sinh Vien");
            System.out.println("4. Tim Sinh Vien");
            System.out.println("5. Xoa Sinh Vien");
            System.out.println("6. Exit");

            try{
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch(Exception e){
                System.out.println("Vui long nhap dung");
                continue;
            }
            switch (choice){
                case 1 -> boSungSV();
                case 2 -> capNhatSV();
                case 3 -> listSV();
                case 4 -> timSV();
                case 5 -> xoaSV();
                case 6 -> {
                    System.out.println("Thoat chuong trinh");
                    return;
                }
                default -> System.out.println("Nhap tu 1 den 6 thoi");
            }
        }while(true);

    }
    private void boSungSV(){
        System.out.println("Nhap ten sinh vien: ");
        String tenSinhVien = scanner.nextLine();
        System.out.println("Nhap nam sinh");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap ma sinh vien");
        String maSinhVien = scanner.nextLine();
        System.out.println("Nhap ma so lop");
        String maLopHoc = scanner.nextLine();

        boolean taoSVthanhCong = sinhVienService.boSungSV(tenSinhVien,namSinh,gioiTinh,maSinhVien,maLopHoc);
        if(taoSVthanhCong){
            System.out.println("Them thanh cong");
        }else{
            System.out.println("Them that bai");
        }
    }
    private void capNhatSV(){
        System.out.println("Nhap ten sinh vien: ");
        String tenSinhVien = scanner.nextLine();
        System.out.println("Nhap nam sinh");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gioi tinh");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhap ma sinh vien");
        String maSinhVien = scanner.nextLine();
        System.out.println("Nhap ma so lop");
        String maLopHoc = scanner.nextLine();

        boolean capNhatSVthanhCong = sinhVienService.capNhatSV(tenSinhVien,namSinh,gioiTinh,maSinhVien,maLopHoc);
        if(capNhatSVthanhCong){
            System.out.println("Them thanh cong");
        }else{
            System.out.println("Them that bai");
        }

    }
    private void listSV(){
        List<SinhVien> danhSachSV = sinhVienService.listSinhVien();
        if(danhSachSV.isEmpty()){
            System.out.println("Danh sach sinh vien rong");
        }else {
            System.out.println("Danh sach sinh vien: ");
            for(SinhVien sinhVien : danhSachSV){
                System.out.println(sinhVien.toString());
            }
        }
}

    private void timSV(){
        System.out.println("Nhap ma sinh vien");
        String maSinhVien = scanner.nextLine();
        SinhVien sinhVien = sinhVienService.timSV(maSinhVien);
        if(sinhVien != null){
            System.out.println(sinhVien);
        }else{
            System.out.println("Khong tim thay sinh vien");
        }
    }

    private void xoaSV(){
        System.out.println("Nhap ma sinh vien: ");
        String maSinhVien = scanner.nextLine();
        sinhVienService.xoaSV(maSinhVien);
        System.out.println("Xoa xong roi");
    }
}
