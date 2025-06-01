package day3;
// thuoc tinh ten tuoi gioi tinh can nang -- attribute
// hanh vi: an, ngu di chuyen, giao tiep -- method ,function
public class ObjectExample {
    private String name;
    private int age;
    private String gender;
    private double weight;

    // ham khoi tao
    ObjectExample(String nameExample){
        this.name = nameExample;
    }

    void an(String a){
        System.out.println("Dang an "+a);
    }

    void ngu(){
        System.out.println("Dang ngu ");
    }

    void dichuyen(String a, String b){
        System.out.println("Dang di tu "+a+" den "+b);
    }

    void giaotiep(String a, String b, String c){
        System.out.println(a+" va "+b+" dang noi ve "+c);
    }
}
