package day3;

public class Animal {
    static int count;
    //ten, tuoi
     String name;
     int age;
    //an,ngu
    Animal(){
        this.name = "";
        this.age = 0;
    } //- contructor mac dinh
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }



    static void eat() {
        System.out.println("eat");
    }

    void sleep() {
        System.out.println("sleep");
    }

    void showInfo(){
        System.out.println("day la con "+name+" nam nay no "+age+" tuoi");
    }
}
