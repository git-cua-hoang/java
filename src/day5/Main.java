package day5;

import day5.repository.LopHocRepo;
import day5.service.LopHocService;
import day5.view.LopHocView;

public class Main {
    public static void main(String[] args){
        LopHocRepo repository = new LopHocRepo();
        LopHocService service =  new LopHocService(repository);

        LopHocView view = new LopHocView(service);

        view.start();
    }
}
