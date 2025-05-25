public class Student {
    //ten,tuoi,chieu cao, can nang, hoc luc, gioi tinh
    String name;
    int age;
    float height;
    double weight;
    char merit;
    boolean isMale;

    // constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void infoPrint() {
        System.out.println("My name is "+name+" and I'm "+age+" years old.");
    }
}
