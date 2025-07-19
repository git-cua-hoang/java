package day5;

import day5.repository.LopHocRepo;
import day5.repository.SinhVienRepo;
import day5.service.LopHocService;
import day5.service.SinhVienService;
import day5.view.LopHocView;
import day5.view.SinhVienView;

public class Main {
    public static void main(String[] args){

        SinhVienRepo svRepo = new SinhVienRepo();
        SinhVienService svService = new SinhVienService(svRepo);
        SinhVienView svView = new SinhVienView(svService);
        svView.start();
    }
}
