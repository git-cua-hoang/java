//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        hung.infoPrint();
        ClassRoom lopHoc = new ClassRoom("VB2",2);
        Student hung = new Student("ThaiHung", 30);
        Student hoang = new Student("Hoang", 31);
        lopHoc.addStudent(hung);
        lopHoc.addStudent(hoang);
        lopHoc.printStudent();


    }
}