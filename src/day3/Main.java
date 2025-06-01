package day3;

public class Main {
    public static void main(String[] args) {
        Assignment hs1 = new Assignment();
        hs1.setName("Hung");
        hs1.setAddress("Tran Duy Hung");
        hs1.setEmail("hung@gmail.com");
        hs1.setPhone("0969696969");
        hs1.genStudentID();
        hs1.showIn4();
        System.out.println("ID: "+hs1.getStudentID());

        Assignment hs2 = new Assignment("Minh","Mai Anh Tuan","minhhap@gmail.com","012342131");
        hs2.genStudentID();
        Assignment.showInfor(hs2);
        System.out.println("Email: "+hs2.getEmail());
        System.out.println("Phone: "+hs2.getPhone());
//        Circle hinhtron = new Circle(1);
//        hinhtron.chuvi();
//        Circle.chuVi2(hinhtron);

//    Animal.count = 0;
//
//    Animal dongvat1 = new Animal();
//    dongvat1.name = "con cho";
//    dongvat1.age = 3;
//    dongvat1.showInfo();
//    Animal.count++;
//
//    Animal dongvat2 = new Animal("con meo", 20);
//    dongvat2.showInfo();
//    Animal.count++;
//
//        System.out.println( Animal.count);


    }
}
