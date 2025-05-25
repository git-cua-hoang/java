package day2;

import java.util.Scanner;

//Viết chương trình giả lập máy tính với các phép tính nhân chia cộng trừ 2 số
public class Assigment1 {
    public static void calculator(){
        do{
            System.out.println("1. Tong");
            System.out.println("2. Hieu");
            System.out.println("3. Tich");
            System.out.println("4. Thuong");
            System.out.println("5. Mod");
            System.out.println("6. Thoat");

            Scanner sc = new Scanner(System.in);
            //chon phep tinh
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            if(choice == 6) return;
            //bat nhap so
            System.out.println("Nhap 2 so can tinh");
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.printf("Tong cua 2 so la: %d", a + b);
                    break;
                case 2:
                    System.out.printf("Hieu cua 2 so la: %d", a - b);
                    break;
                case 3:
                    System.out.printf("Tich cua 2 so la: %d", a * b);
                    break;
                case 4:
//                    if (b == 0)
//                        System.out.println("Deo duoc ban oi");
//                    else
                        System.out.printf("Thuong cua 2 so la: %f", b != 0 ? (float) a / b : 0);
                    break;
                case 5:
                    System.out.printf("So du cua phep chia %d cho %d la %d", a, b, a % b);
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println("--------------------------------------");
        } while (true);
    }

}
