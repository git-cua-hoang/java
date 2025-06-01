package day2;

// Tao 1 mang n phan tu, nhap cac phan tu.
// Tinh tong cac so trong mang
// In ra so lon nhat mang
// Tim so chan nho nhat mang

import java.util.Scanner;

public class Assigment2 {
    public static void bt() {
        System.out.println("Nhap so luong phan tu cua mang di tml");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mangSoNguyen = new int[n];
        int tong =0;
        int somax = 0;
        int sochannn = 0;
        boolean checkSoChan = false;
        for(int i = 0; i< n; i++){
            System.out.printf("Nhap so phan tu thu %d\n",i+1);
            int a = sc.nextInt();
            mangSoNguyen[i] = a;
            tong = tong + a;
            somax = Math.max(somax, a);
            if (a%2 == 0) {
                if (!checkSoChan) {
                    sochannn = a;
                    checkSoChan = true;
                } else {
                    sochannn = Math.min(sochannn, a);
                }
            };
        };
        System.out.printf("Tong la %d",tong);
        System.out.printf("So max la %d" ,somax);
        if(checkSoChan) {
            System.out.printf("So  chan nho nhat la %d",sochannn);
        }else
            System.out.println("Khong co so chan nao ca");

    }

}
